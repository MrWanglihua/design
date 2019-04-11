package com.example.design.singletonTest;

public class LazySingleton {

    public static LazySingleton singleton = null;

    public static LazySingleton getInstance(){
        if(singleton ==null){
            singleton = new LazySingleton();
        }
        return  singleton;
    }

}
