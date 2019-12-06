package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[40];
        for (int i = 0; i < cats.length; i++) {
            boolean flagSex = ((int)(Math.random()*2) == 0);
            cats[i] = new Cat("Барсик" + i, flagSex ? "М" : "Ж",
                    "Серо-оранжевый", 4);
        }

        for(int i = 0; i < cats.length; i++)
            cats[i].info();
    }
}
