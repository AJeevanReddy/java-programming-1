package com.company;

public class Circle {
    private double radius;
    private String color;
    public Circle(){
        radius=1.0;
        color="red";
    }
    public Circle(double r)
    {
        radius=r;
        color="red";
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius*radius*3.14;
    }

    public static void main(String[] args) {
        Circle c=new Circle(5);
        System.out.println(c.getRadius());
        System.out.println(c.getArea());
    }
}
