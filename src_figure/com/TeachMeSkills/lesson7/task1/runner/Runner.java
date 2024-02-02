package com.TeachMeSkills.lesson7.task1.runner;

import com.TeachMeSkills.lesson7.task1.title.*;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Accountant acc = new Accountant();
        Principle principle = new Principle();
        Worker work = new Worker();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ID должности: ");

        int a = 0;
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        } else {
            System.out.print("Введен некорректный ID");
            System.exit(1);
        }
       scanner.close();

        if (a != acc.id && a != principle.id && a != work.id) {
            System.out.print("Такого ID не существует");
            System.exit(2);
        } else {
            if (a == principle.id) principle.title();
            if (a == work.id) work.title();
            if (a == acc.id) acc.title();
        }
    }
}
