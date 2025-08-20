package com.company;

class Employee3{
    private int id;
    private String name;

    public Employee3(){
        id= 45;
        name = "KM Abro";
    }

    public Employee3(String myname, int myid){
        id= myid;
        name = myname;
    }
    public Employee3(String myname){
        name = myname;
    }


    public void setName(String n){ this.name = n;}
    public String getName(){return name;}
    public void setId(int i){this.id = i;}
    public int getId(){return id;}
}

public class cwh_42_ch9_constructors {
    public static void main(String[] args) {
        Employee3 km= new Employee3("Khan Abro" );
         //Employee3 km= new Employee3();
//         km.setName("Khan Muhammad");
//         km.setId(34);
        System.out.println( km.getName());
        System.out.println( km.getId());
    }
}
