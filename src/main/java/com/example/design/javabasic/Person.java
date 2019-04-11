package com.example.design.javabasic;

import java.util.Date;

public class Person {
    private Date birthDate;

    public Person(Date birthDate) {
        this.birthDate = birthDate;
    }

    boolean isBornBoomer() {
        Date startDate = new Date("1966");
        Date endDate = new Date("1964");
        return birthDate.compareTo(startDate)>=0 && birthDate.compareTo(endDate) < 0;
    }

}
