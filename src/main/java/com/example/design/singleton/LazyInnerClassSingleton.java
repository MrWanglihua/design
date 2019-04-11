package com.example.design.singleton;

public class LazyInnerClassSingleton {


    public LazyInnerClassSingleton() {
        if(LazyClazz.LASS !=null){
            throw new RuntimeException("不予许创建多个实例");
        }
    }

    public static LazyInnerClassSingleton getInstance(){

        return LazyClazz.LASS;
    }

    public static class LazyClazz{
        public static final LazyInnerClassSingleton LASS = new LazyInnerClassSingleton();
    }
}
