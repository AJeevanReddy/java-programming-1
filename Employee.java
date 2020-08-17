package com.company;

import java.util.Arrays;
import java.util.List;

public class Employee {
    int empid;
    String empname;
    String empDesignation;
    int empsalary;
    String emplocation;

    public Employee(int empid, String empname, String empDesignation, int empsalary, String emplocation) {
        this.empid=empid;
        this.empname=empname;
        this.empDesignation=empDesignation;
        this.empsalary=empsalary;
        this.emplocation=emplocation;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public int getEmpsalary() {
        return empsalary;
    }

    public void setEmpsalary(int empsalary) {
        this.empsalary = empsalary;
    }

    public String getEmplocation() {
        return emplocation;
    }

    public void setEmplocation(String emplocation) {
        this.emplocation = emplocation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", empname='" + empname + '\'' +
                ", empDesignation='" + empDesignation + '\'' +
                ", empsalary=" + empsalary +
                ", emplocation='" + emplocation + '\'' +
                '}';
    }

}
