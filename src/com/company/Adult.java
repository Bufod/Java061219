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

    @Override
    public String toString() {
        return firstname + " " + lastname + ":\n\tВозраст: " + age
                + "\n\tПол: " + gender + "\n\tНациональность: " + nationality + "\n\tМесто работы: "
                + placeOfWork + "\n\tОпыт работы: " + experience + "\n\tДолжность: " + post + "\n";
    }
}
