package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Child child1 = new Child("Олег", "Адаменко", 15,
                "мужской", "Русский", "Школа 39");
        Adult adult1 = new Adult("Петр", "Первый", 26, "мужской", "Русский",
                "Google", "6","Владелец");

        System.out.println(child1);
        System.out.println(adult1);
    }
}
