package com.example.design.proxy;

public class ProxyTest {

    public static void main(String[] args) {
        /*Father father = new Father(new Son());
        father.findLover();*/

        Person obj = (Person) new JDKMeiPo().getInstance(new Custom());
        obj.findLover();
    }

}
