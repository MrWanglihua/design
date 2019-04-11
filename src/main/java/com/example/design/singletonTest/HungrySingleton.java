package com.example.design.singletonTest;

public class HungrySingleton {

    private static final HungrySingleton sington ;
    static {
        sington = new HungrySingleton();
    }


    public static HungrySingleton getInstance(){
        return sington;
    }


}
