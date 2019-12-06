package com.company;

public class Adult extends People{
    String placeOfWork;
    String experience;
    String post;

    Adult(String firstname, String lastname, int age, String gender,
          String nationality, String placeOfWork, String experience,
          String post) {
        super(firstname, lastname, age, gender, nationality);
        this.placeOfWork = placeOfWork;
        this.experience = experience;
        this.post = post;
    }
}
