package com.example.design.singletonTest;

import java.util.HashMap;
import java.util.Map;

public class ContainerSingletom {

    private static Map<String,Object> ioc = new HashMap<>();

    public static Object getInstance(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        synchronized (ioc){
            if(!ioc.containsKey(className)){
                Object obj = Class.forName(className).newInstance();
                ioc.put(className,obj);
                return obj;
            }else{
                return ioc.get(className);
            }
        }
    }



}
