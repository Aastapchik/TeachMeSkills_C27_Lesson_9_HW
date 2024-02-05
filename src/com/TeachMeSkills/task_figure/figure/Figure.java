package com.TeachMeSkills.task_figure.figure;

/*
**The class is a general class for shapes**
 */

public abstract sealed class Figure permits Circle, Triangle, Rectangle{
    public String name;
    //double[] length;
    abstract public double square(double[] length);


    abstract public double perimeter(double[] length);

}
