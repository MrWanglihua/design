package com.example.design.proxy.dynamicProxy.gpproxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 用来生成源代码的工具类
 */
public class GPProxy {

    public static final String ln = "\r\n";

    private static Map<Class,Class> mappings = new HashMap<Class, Class>();
    static {
        mappings.put(int.class,Integer.class);
    }

    /**
     *根据接口获取实现的方法，并生成方法来覆盖原来的方法
     * 在方法中调用代理类的invoke方法，用来增强功能
     * @param classLoader
     * @param interfaces  这个类实现了那些接口
     * @param h
     * @return
     */
    public static Object newProxyInstance(GPClassLoader classLoader, Class<?> [] interfaces, GPInvocationHandler h){
        try {
            //1、动态生成源代码.java 文件
            String src = generateSrc(interfaces);
            //2、Java 文件输出磁盘
            String filePath = GPProxy.class.getResource("").getPath();
            File f = new File(filePath + "$Proxy0.java");
            FileWriter fw = null;
            fw = new FileWriter(f);
            fw.write(src);
            fw.flush();
            fw.close();

            //3、把生成的.java 文件编译成.class 文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manage = compiler.getStandardFileManager(null,null,null);
            Iterable iterable = manage.getJavaFileObjects(f);
            JavaCompiler.CompilationTask task =
                    compiler.getTask(null,manage,null,null,null,iterable);
            task.call();
            manage.close();
            //4、编译生成的.class 文件加载到 JVM 中来
            Class proxyClass = classLoader.findClass("$Proxy0");
            Constructor c = proxyClass.getConstructor(GPInvocationHandler.class);
            f.delete();

            //5、返回字节码重组以后的新的代理对象
            return c.newInstance(h);



        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 动态生成源代码.java 文件
     * @param interfaces  被代理的类类型
     * @return
     */
    private static String generateSrc(Class<?>[] interfaces) {

        StringBuffer sb = new StringBuffer();
        sb.append("package com.example.design.proxy.dynamicproxy.gpproxy;" + ln);
        sb.append("import com.example.design.proxy.Person;" + ln);
        sb.append("import java.lang.reflect.*;" + ln);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);
        sb.append("GPInvocationHandler h;" + ln);
        sb.append("public $Proxy0(GPInvocationHandler h) { " + ln);
        sb.append("this.h = h;");
        sb.append("}" + ln);

        for (Method m : interfaces[0].getMethods()) {
            Class<?>[] params = m.getParameterTypes();

            StringBuffer paramNames = new StringBuffer();
            StringBuffer paramValues = new StringBuffer();
            StringBuffer paramClasses = new StringBuffer();

            for (int i = 0; i < params.length; i++) {
                Class clazz = params[i];

                String type = clazz.getName();
                String paramName = toLowerFirstCase(clazz.getSimpleName());
                paramNames.append(type + " " + paramName);
                paramValues.append(paramName);
                paramClasses.append(clazz.getName() + ".class");

                if (i > 0 && i < params.length - 1) {
                    paramNames.append(",");
                    paramClasses.append(",");
                    paramValues.append(",");
                }
            }
                sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "(" +
                        paramNames.toString() + ") {" + ln);
                sb.append("try{" + ln);
                sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\""
                        + m.getName() + "\",new Class[]{" + paramClasses.toString() + "});" + ln);
                sb.append((hasReturnValue(m.getReturnType()) ? "return " : "") +
                        getCaseCode("this.h.invoke(this,m,new Object[]{" + paramValues + "})", m.getReturnType()) + ";" + ln);
                sb.append("}catch(Error _ex) { }");
                sb.append("catch(Throwable e){" + ln);
                sb.append("throw new UndeclaredThrowableException(e);" + ln);
                sb.append("}");
                sb.append(getReturnEmptyCode(m.getReturnType()));
                sb.append("}");
            }

            sb.append("}" + ln);
            return sb.toString();
        }

    /**
     * 根据返回类型，设置默认返回
     * @param returnClass
     * @return
     */
    private static String getReturnEmptyCode(Class<?> returnClass){
        if(mappings.containsKey(returnClass)){
            return "return 0;";
        }else if(returnClass == void.class){
            return "";
        }else {
            return "return null;";
        }
    }


    /**
     *
     * @param code
     * @param returnClass
     * @return
     */
    private static String getCaseCode(String code,Class<?> returnClass) {
        if (mappings.containsKey(returnClass)) {
            return "((" + mappings.get(returnClass).getName() + ")" + code + ")." +
                    returnClass.getSimpleName() + "Value()";
        }
        return code;
    }

    /**
     * 判断当前类方法是否有返回
     * @param clazz
     * @return
     */
    private static boolean hasReturnValue(Class<?> clazz){
        return clazz != void.class;
    }

    /**
     * 将传入的字符串首字母小写
     * @param src
     * @return
     */
    private static String toLowerFirstCase(String src){
        char [] chars = src.toCharArray();
        chars[0] += 32;
        return String.valueOf(chars);
    }

}
