package com.example.design.prototype;

public class ConcretePrototype implements Prototype{

    private String name;
    private String hobbies;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Prototype clone() {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAge(this.age);
        prototype.setName(this.name);
        prototype.setHobbies(this.hobbies);
        return prototype;
    }



}
