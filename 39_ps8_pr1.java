package com.company;

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
         name = n;
    }



}

public class cwh_39_ps8_pr1 {
    public static void main(String[] args) {

        //Question 1
        // Create a class Employee with following properties and methods:
        //Salary (property) (int)
        //getSalary (method returning int)
        // Name (property) (String)
        // getName (method returning String)
        //setName (method changing name)

        Employee km= new Employee();
        km.setName("Khan Muhammad");
        km.salary = 5000;
        System.out.println(km.getSalary());
        System.out.println( km.getName());




    }
}
