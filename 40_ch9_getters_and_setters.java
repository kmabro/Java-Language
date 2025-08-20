package com.company;

class MyEmployee{
       private int id;
       private String name;

    public void setName(String n){
        this.name = n;
    }


    public String getName(){
        return name;
    }


    public void setId(int i){
        this.id = i;
    }

       public int getId(){
           return id;
       }


}

public class cwh_40_ch9_getters_and_setters {
    public static void main(String[] args) {

        MyEmployee km= new MyEmployee();
       // km.id=45;
       // km.name = "Khan Muhammad ";
        km.setName("Khan Muhammad");
        System.out.println(km.getName());
        km.setId(133);
        System.out.println(km.getId());
    }
}
