package com.company;

public class Triangle {
    double a,b,c;
    Triangle(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double area(){
        double s;
        s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public static void main(String[] args) {
        Triangle t=new Triangle(2,5,6);
        System.out.println(t.area());
    }
}
