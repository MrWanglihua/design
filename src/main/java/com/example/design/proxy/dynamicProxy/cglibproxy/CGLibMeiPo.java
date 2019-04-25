package com.example.design.proxy.dynamicProxy.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibMeiPo implements MethodInterceptor {


    public Object getInstance(Class<?> clazz){
//        初始化一个工具类
        Enhancer enhancer = new Enhancer();
//        让其继承所要代理的类
        enhancer.setSuperclass(clazz);
//        回调代理方法
        enhancer.setCallback(this);
//        返回创建的类
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        this.before();
        Object obj = methodProxy.invokeSuper(o,objects);

        this.after();
        return obj;
    }
    private void before(){
        System.out.println("我是媒婆：我要给你找对象，现在已经拿到你的需求");
        System.out.println("开始物色");
    }
    private void after(){
        System.out.println("如果合适的话，就准备办事");
    }
}
