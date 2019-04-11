package com.example.design.test;

public class Father implements Person{
    Son son = new Son();

    @Override
    public void findLover() {
        System.out.println("父母给物色对象");
        son.findLover();
        System.out.println("双方父母同意交往，关系确立");
    }
}
