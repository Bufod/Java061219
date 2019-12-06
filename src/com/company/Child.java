package com.company;

public class Child extends People {
    String educationalInst;

    Child(String firstname, String lastname, int age, String gender,
          String nationality, String educationalInst) {
        super(firstname, lastname, age, gender, nationality);
        this.educationalInst = educationalInst;
    }
}

