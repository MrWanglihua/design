package com.example.design.singletonTest;

import java.io.Serializable;

public class SeriableSingleton implements Serializable {

    private static final SeriableSingleton SINGLETON = new SeriableSingleton();

    public SeriableSingleton() {
    }

    public static SeriableSingleton getInstance(){
        return SINGLETON;
    }
    private Object readResove() {
        return SINGLETON;
    }


}
