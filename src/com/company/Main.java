package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Child child1 = new Child("Олег", "Адаменко", 15,
                "мужской", "Русский", "Школа 39");
        Adult adult1 = new Adult("Петр", "Первый", 26, "мужской", "Русский",
                "Google", "6","Владелец");

        FileWriter fout = null;
        try {
            fout = new FileWriter("output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        fout.write(child1.toString());
        fout.write(adult1.toString());
        fout.close();
    }
}
