package com.company;

public class People {
    String firstname;
    String lastname;
    int age;
    String gender;
    String nationality;
    People(String firstname, String lastname, int age, String gender,
           String nationality){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return firstname + " " + lastname + ":\n\tВозраст: " + age
                + "\n\tПол: " + gender + "\n\tНациональность: " + nationality + "\n";
    }
}
