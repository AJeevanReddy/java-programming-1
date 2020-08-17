package com.company;
import java.util.Scanner;
class Rectangle{
    int width,height;
    public void display(){
        System.out.println("Width is " + width  + "  Height is  " + height);
        System.out.println("Area of rectangle is " + width*height);
    }
}
public class RectangleArea extends Rectangle {
    public void read_input() {
        Scanner sc = new Scanner(System.in);
        width = sc.nextInt();
        height = sc.nextInt();
    }

    public static void main(String args[]) {

    RectangleArea ar = new RectangleArea();
    ar.read_input();
    ar.display();
}
}
