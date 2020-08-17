package com.company;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeObjec {
    public static void main(String[] args) {
        List<Employee> people = Arrays.asList(
          new Employee(1,"Jeevan","Manager",42352,"Kadapa"),
          new Employee(2,"Reddy","executivE",54230,"Rayachoti"),
          new Employee(3,"Tharun","cheif",58923,"Jalandhar"),
          new Employee(4,"Santhosh","director",45623,"Hyderabad"),
          new Employee(5,"Jyothi","chef",32500,"chittor"),
          new Employee(6,"Umar","Supervisior",25301,"Manchi"),
          new Employee(7,"Prakash","asistancE",58960,"karchi"),
          new Employee(8,"shiva","Designer",25603,"Manipur"),
          new Employee(9,"sundhar","executivE",65823,"Macharala"),
          new Employee(10,"sai","operator",25630,"kerala")
        );
        people.stream().filter(p -> p.getEmplocation().startsWith("M")).forEach(p -> System.out.println(p.getEmplocation()));
        people.stream().filter(p -> p.getEmpDesignation().endsWith("E")).forEach(p -> System.out.println(p.empDesignation));
        people.stream().filter(p -> p.getEmpsalary() > 50000).forEach(p -> System.out.println(p.getEmpsalary()));
        people.stream().filter(p -> p.getEmpname() != null).forEach(p -> System.out.println(p.getEmpname()));

    }
}
