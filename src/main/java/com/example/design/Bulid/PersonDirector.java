package com.example.design.Bulid;

public class PersonDirector {
    public Person constructPerson(PersonBuilder pb) {  
        //按照 身体--->头部--->四肢 的顺序创建人物  
        pb.buildHead();  
        pb.buildBody();  
        pb.buildFoot();  
        return pb.buildPerson();  
    }  
}  