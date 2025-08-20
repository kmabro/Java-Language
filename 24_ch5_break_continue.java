package com.company;

public class cwh_24_ch5_break_continue {
    public static void main(String[] args) {
        //Break and Continue using loops
//        for(int i=0; i<5;i++){
//            System.out.println(i);
//            System.out.println("Java is Easy language ");
//            if(i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//        }
//
//int i=0;
//        while(i<5) {
//            System.out.println(i);
//            System.out.println("Java is Easy language ");
//            if (i == 2) {
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;
//        }


//
//        int i=0;
//      do {
//            System.out.println(i);
//            System.out.println("Java is Easy language ");
//            if (i == 2) {
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;
//        }while(i<5);


     //   System.out.println("Loop ends here");

//
//        for(int i=0; i<5;i++) {
//
//            if (i == 2) {
//                System.out.println("Ending the loop");
//                continue;
//            }
//                System.out.println(i);
//                System.out.println("Java is Easy language ");
//
//        }

                int i=0;
        do {
            i++;
            if (i == 2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is Easy language ");

        }while(i<5);

                System.out.println("Loop ends here");

    }
}
