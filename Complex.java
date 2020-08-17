package com.company;

public class Complex {
    double real,imaginary;

    public Complex(double real,double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }

    public Complex() {

    }

    Complex addComp(Complex c1,Complex c2)
    {
        Complex temp =new Complex();
        temp.real=c1.real + c2.real;
        temp.imaginary=c1.imaginary + c2.imaginary;
        return  temp;
    }
    Complex subtractComp(Complex c1,Complex c2)
    {
        Complex temp=new Complex();
        temp.real=c1.real - c2.real;
        temp.imaginary=c1.imaginary-c2.imaginary;
        return  temp;
    }
    Complex productComp(Complex c1,Complex c2)
    {
        Complex temp=new Complex();
        temp.real=c1.real*c2.real;
        temp.imaginary=c1.imaginary*c2.imaginary;
        return  temp;
    }
    public void printComplexNumber(){
        System.out.println("Complex number: " + real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {
        Complex c1=new Complex(4,5);
        c1.printComplexNumber();
        Complex c2=new Complex(6,9);
        c2.printComplexNumber();
        Complex c3=new Complex();
        c3=c3.addComp(c1,c2);
        System.out.println("sum of :");
        c3.printComplexNumber();
        c3=c3.subtractComp(c1,c2);
        System.out.println("difference is :");
        c3.printComplexNumber();
        c3=c3.productComp(c1,c2);
        System.out.println("product is :");
        c3.printComplexNumber();

    }
}
