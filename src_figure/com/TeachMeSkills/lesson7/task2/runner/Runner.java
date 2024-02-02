package com.TeachMeSkills.lesson7.task2.runner;

import com.TeachMeSkills.lesson7.task2.figure.*;
import java.util.Scanner;
/*
**The class creates a program script and reproduces it**
*/
public class Runner {

    public static void main(String[] args) {

        Triangle tr1 = new Triangle();
        Triangle tr2 = new Triangle();
        Circle cr1 = new Circle();
        Rectangle rct1 = new Rectangle();
        Rectangle rct2 = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        double[] l = new double[3];
        double sumPer = 0;
        Figure[] fig = new Figure[]{tr1, tr2, cr1, rct1, rct2};

        for (Figure figure : fig) {
            if (figure.name.equals("Circle")) {
                System.out.print("Введите радиус окружности: ");
                l[0] = scanner.nextDouble();
                if(l[0] <= 0) {
                    System.out.println("Некорректный радиус"); continue;
                }
                System.out.println("Периметр окружности равен: " + figure.perimeter(l) + "; Площадь круга равна: " + figure.square(l));
                sumPer += figure.perimeter(l);
            }
            if (figure.name.equals("Triangle")) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Введите " + (j + 1) + "-ю сторону треугольника: ");
                    l[j] = scanner.nextDouble();
                }
                if((l[0] + l[1] > l[2]) && (l[0] + l[2] > l[1]) && (l[1] + l[2] > l[0]) && l[0] > 0 && l[1] > 0 && l[2] > 0)
                {
                    System.out.println("Периметр треугольника равен: " + figure.perimeter(l) + "; Площадь треугольника равна: " + figure.square(l));
                    sumPer += figure.perimeter(l);

                }
                else {
                    System.out.println("Треугольник с указанными сторонами не существует.");
                    continue;
                }

            }
            if (figure.name.equals("Rectangle")) {
                System.out.print("Введите длину прямоугольника: ");
                l[0] = scanner.nextDouble();
                System.out.print("Введите ширину прямоугольника: ");
                l[1] = scanner.nextDouble();
                if(l[1] <= 0 || l[0] <= 0) {
                    System.out.println("Введены некорректные стороны");
                    continue;
                }
                System.out.println("Периметр прямоугольника равен: " + figure.perimeter(l) + "; Площадь прямоугольника равна: " + figure.square(l));
                sumPer += figure.perimeter(l);
            }
        }

        scanner.close();
        System.out.println("Сумма всех периметров фигур равна: " + sumPer);
    }
}
