package com.TeachMeSkills.task_figure.figure;
/*
**The class describes a circle and contains methods for finding the area of the circle and circumference**
 */
public final class Circle extends Figure{
    double PI = 3.1415926;

    public Circle() {
        this.name = "Circle";
}
    @Override
    public double square(double[] l) {
        return PI*l[0]*l[0];
    }

    @Override
    public double perimeter(double[] l) {
        return 2*PI*l[0];
    }
}
