package com.company;

public class EmployeeDetail {
    String name;
    int year;
    int salary;
    String address;
    public EmployeeDetail(String name,int year,int salary,String address){
        this.name=name;
        this.year=year;
        this.salary=salary;
        this.address=address;
    }
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }
    public int getSalary(){
        return salary;
    }
    public String getAddress(){
        return address;
    }

    public static void main(String[] args) {
        EmployeeDetail ed1=new EmployeeDetail("Robert",1994,25360,"64C- WallStreet");
        EmployeeDetail ed2=new EmployeeDetail("Sam",2000,35360,"68D- WallStreet");
        EmployeeDetail ed3=new EmployeeDetail("John",1999,56360,"26B- WallStreet");
        System.out.println("Name\t\tYear of joining\t\t Address");
        System.out.println(ed1.getName()+"\t\t\t"+ed1.year+"\t\t\t"+ed1.address);
        System.out.println(ed2.getName()+"\t\t\t\t"+ed2.year+"\t\t\t"+ed2.address);
        System.out.println(ed3.getName()+"\t\t\t"+ed3.year+"\t\t\t"+ed3.address);
    }
}
