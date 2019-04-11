package com.example.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKMeiPo implements InvocationHandler {

    private Object target;
    public Object getInstance(Object target){
        this.target = target;
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.before();
        Object object = method.invoke(this.target,args);
        after();

        return object;
    }

    private void before(){
        System.out.println("我是媒婆：我要给你找对象，现在拿到你的需求！");
        System.out.println("开始物色对象");
    }

    private void after(){
        System.out.println("如果合适的话，就尽快办事吧！");
    }

}
