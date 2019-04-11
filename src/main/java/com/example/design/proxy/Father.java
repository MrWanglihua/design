package com.example.design.proxy;

public class Father implements Person{
    Son son ;

    public Father(Son son) {
        this.son = son;
    }


    @Override
    public void findLover() {
        System.out.println("父母给物色对象");
        this.son.findLover();
        System.out.println("双方父母同意交往，确立关系！");
    }
}


