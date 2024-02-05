package com.TeachMeSkills.task_figure.figure;
/*
**The class describes a triangle and contains methods for finding the area and perimeter of a triangle**
 */
public final class  Triangle extends Figure{
    public Triangle() {
        this.name = "Triangle";
    }
    @Override
   public  double square(double[] l) {
        double p = 0.5*(l[0] + l[1] + l[2]);
        return Math.sqrt(p*(p-l[0])*(p-l[1])*(p-l[2]));
    }

    @Override
    public double perimeter(double[] l) {
        return l[0]+l[1]+l[2];
    }
}
