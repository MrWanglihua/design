package com.example.design.singleton;

public class LazySingleton {

    private static LazySingleton singleton = null;

    public static synchronized LazySingleton getInstance(){
        if(singleton == null){
            singleton = new LazySingleton();
        }
        return singleton;
    }

    public static class ExtorThread implements Runnable{


        @Override
        public void run() {
            LazySingleton ton = LazySingleton.getInstance();
            System.out.println(Thread.currentThread().getName()+":"+ton);
        }
    }

    public static void main(String[] args) {
        ExtorThread thread1 = new ExtorThread();
        ExtorThread thread2 = new ExtorThread();
        thread1.run();
        thread2.run();
        System.out.println("end");
    }

}
