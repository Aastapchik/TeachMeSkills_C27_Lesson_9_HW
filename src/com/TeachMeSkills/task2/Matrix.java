package com.TeachMeSkills.task2;
/*
Class methods allow you to display a matrix on the screen and multiply two matrices
 */
public class Matrix {

    public static void showMatrix(double[][] a)
    {
        for (double[] doubles : a) {
            for (double aDouble : doubles)
                System.out.print(aDouble + " ");
            System.out.println();
        }

    }

    public static double[][] product(double[][] a, double [][] b)
    {
        double[][] c = new double[a.length][b[0].length];
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < b[0].length; j++)
            {
                for(int k = 0; k < b.length; k++){
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        return c;
    }
}
