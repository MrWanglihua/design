package com.example.design.prototype;

public class ProtoTest {

    public static void main(String[] args) {
        Client client = new Client();


        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setName("abc");
        prototype.setHobbies("女人");
        prototype.setAge(21);
        ConcretePrototype prototype1 = (ConcretePrototype)prototype.clone();
        System.out.println(prototype1.getName());
        System.out.println(prototype1.getAge());
        System.out.println(prototype1.getHobbies());
        System.out.println(prototype == prototype1);


    }

}
