package com.example.design.singleton;

public enum EnumSingleton {
    INSTANCE;

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

}
