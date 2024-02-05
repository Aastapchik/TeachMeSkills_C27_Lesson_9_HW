package com.TeachMeSkills.task2.runner;

import com.TeachMeSkills.task2.util.Util;

/*
The class is required to simulate the operation of the program
 */
public class Runner {

    public static void main(String[] args) {

        double[][] a = new double[][]{{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        double[][] b = new double[][]{{1,2,3},{1,1,1},{0,0,0},{2,1,0}};

        System.out.println("Первая матрица: ");
        Util.showMatrix(a);
        System.out.println("Вторая матрица: ");
        Util.showMatrix(b);

        if(a[0].length != b.length)
        {
            System.out.println("Умножение матриц невозможно");
            System.exit(2);
        }

        System.out.println("Их произведение: ");
        Util.showMatrix(Util.product(a, b));
    }
}
