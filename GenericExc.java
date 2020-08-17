package com.company;
import java.util.*;
public class GenericExc {
    static void check(String n)
    {
        try{
            int p = Integer.parseInt(n);
           // System.out.println(p);
            double q=p/3;
            double ans=p-q;;
            System.out.println(ans);
        }catch (NumberFormatException ex) {
            System.out.println("Entered value is not a number");
        }
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        String n=sc.nextLine();
        check(n);
    }
    }
