package com.example.design.singleton;

public  class ExtorThread implements Runnable{

        @Override
        public void run() {
            LazyInnerClassSingleton ton = LazyInnerClassSingleton.getInstance();
            System.out.println(Thread.currentThread().getName()+":"+ton);
        }

    public static void main(String[] args) {
            ExtorThread thread1 = new ExtorThread();
            ExtorThread thread2 = new ExtorThread();
            Thread thread11 = new Thread(thread1);
            Thread thread22 = new Thread(thread2);
            thread11.start();
            thread22.start();
            System.out.println("end");
    }

    }