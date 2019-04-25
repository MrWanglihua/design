package com.example.design.proxy.dynamicProxy.jdkProxy;

import com.example.design.proxy.dynamicProxy.gpproxy.GPClassLoader;
import com.example.design.proxy.dynamicProxy.gpproxy.GPInvocationHandler;
import com.example.design.proxy.dynamicProxy.gpproxy.GPProxy;

import java.lang.reflect.Method;

/**
 * 动态代理必须实现这个类，方便反调用
 */
public class GPMeipo implements GPInvocationHandler {

    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        this.before();
        Object obj = method.invoke(target, args);

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
