package com.example.design.proxy.dynamicProxy.source;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceDynamicProxy implements InvocationHandler {

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.before(args[0]);
        Object invoke = method.invoke(target, args);
        this.after();
        return invoke;
    }

    private void before(Object object){
//        进行数据源的切换
        System.out.println("Proxy after method ");
        try {
           Long time  = (Long)object.getClass().getMethod("getCreateTime").invoke(object);
            Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
            System.out.println("动态代理类自动分配到【DB_"+dbRouter+"】数据源处理数据");

            DynamicDataSourceEntry.set(dbRouter);

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    private void after(){
//        切换为默认数据源
        System.out.println("Proxy after method");
        DynamicDataSourceEntry.restore();
    }



}