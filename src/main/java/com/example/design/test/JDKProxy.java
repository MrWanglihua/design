package com.example.design.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy implements InvocationHandler {

    private Object targect;

    public Object getInstance(Object targect) {
        this.targect = targect;
        Class<?> clazz = targect.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.befor();
        Object obj = method.invoke(this.targect,args);
        this.after();

        return obj;
    }

    private void befor(){
        System.out.println("我是媒婆，获取你的需求");
        System.out.println("开始物色对象！");
    }

    private void after(){
        System.out.println("如果合适，就办事吧！");
    }


}
