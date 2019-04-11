package com.example.design.singleton;

public class HungrySingleton {
   /* private static final HungrySingleton ton = new HungrySingleton();

    public static  HungrySingleton getInstance(){
        return ton;
    }*/
    /**
     * 利用静态代码块的方式
     */
    private static final HungrySingleton ton;
    static {
        ton = new HungrySingleton();
    }

    public HungrySingleton() {
    }
    public static HungrySingleton getInstance(){
        return ton;
    }
}
