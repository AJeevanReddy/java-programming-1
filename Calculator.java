package com.company;

public class Calculator {

    interface Operations{
        int operation(int a,int b);
    }

    public static void main(String[] args) {
        Operations additin=(int a,int b)->a+b;
        System.out.println("addition " + additin.operation(2,3));

        Operations subtraction=(int a,int b)->(a-b);
        System.out.println("Difference " + subtraction.operation(3,5));

        Operations product=(int a,int b)->a*b;
        System.out.println("Product " + product.operation(2,3));

        Operations safeDivision=(int a,int b)->{
            if (b == 0)
                return 0;
            return (a/b);
        };
        System.out.println("safeDivision " + safeDivision.operation(10,5));
    }
}
