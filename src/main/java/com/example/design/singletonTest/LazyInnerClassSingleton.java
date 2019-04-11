package com.example.design.singletonTest;

public class LazyInnerClassSingleton {


    public LazyInnerClassSingleton() {
        if(Lazz.LAZY != null){
            throw new RuntimeException("不能创建相同对象");
        }
    }

    public static LazyInnerClassSingleton getInstance(){
        return Lazz.LAZY;
    }
    private static final class Lazz{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

}
