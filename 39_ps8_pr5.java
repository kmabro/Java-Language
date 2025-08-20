package com.company;

class Tommy {
    public void hit(){
        System.out.println("Hitting...");
    }

    public void run(){
        System.out.println("Running...");
    }

    public void fire(){
        System.out.println("Firing...");
    }


}

public class cwh_39_ps8_pr5 {
    public static void main(String[] args) {

        //Question 5
        //Create a class TommyVecetti for rockstar games capable of hitting (Print Hitting) , running , firing etc

        Tommy km = new Tommy();
        km.hit();
        km.fire();
        km.run();

    }
}
