//import java.util.Scanner;

public class Advanced_Pattern_Questions {
    public static void main(String[] args) {
        
        

            //Question 1
        //Print the following pattern (Butterfly)
        
        /*


          *      *
          **    **
          ***  ***
          ********
          ********
          ***  ***
          **    **
          *      *


            */

            //Answer

//             int n=5;
//             for(int i= 1; i<=n; i++){
//                 for(int j=1; j<=i; j++){
//                     System.out.print("*");
//                 }
//                 //Spaces 
//                 int spaces = 2*(n-i);
//                 for(int j=1; j<= spaces; j++){
//                     System.out.print(" ");
//                 }

//                 //2nd part
//                 for(int j=1; j<=i; j++){
//                     System.out.print("*");
//                 }
//                System.out.println();
//             }

// //Lower half

//             for(int i= n; i>=1; i--){
//                 for(int j=1; j<=i; j++){
//                     System.out.print("*");
//                 }
//                 //Spaces 
//                 int spaces = 2* (n-1);
//                 for(int j=1; j<= spaces; j++){
//                     System.out.print(" ");
//                 }

//                 //2nd part
//                 for(int j=1; j<=i; j++){
//                     System.out.print("*");
//                 }
//                System.out.println();
//             }





            
            //Question 2
        //Print the following pattern (Solid Rhombus)
        
        /*

                    *****
                   *****
                  *****
                 *****
                *****


            */

            //Answer


            // int n = 5; // Size of the rhombus

            // for (int i = 1; i <= n; i++) {
            //     // Spaces
            //     for (int j = 1; j <= n - i; j++) {
            //         System.out.print(" ");
            //     }
            //     // Stars
            //     for (int j = 1; j <= 5; j++) {
            //         System.out.print("*");
            //     }
            //     // Move to the next line after printing all stars for the current row
            //     System.out.println();
            // }


            
            
            //Question 3
        //Print the following pattern (Number Pyramid)
        
        /*

             1
            2 2
           3 3 3
          4 4 4 4
         5 5 5 5 5      


            */

            //Answer



            // int n= 5; 
            // for(int i=1; i<=n; i++){
            //     for(int j=1; j<=n-i; j++){
            //         System.out.print(" ");
            //     }
            //     //numbers
            //     for(int j=1; j<=i ; j++){
            //         System.out.print(i+" ");
            //     }
            //     System.out.println();
            // }


             
            //Question 4
        //Print the following pattern (Palindromic Pattern)
        
        /*

             1
           2 1 2
         3 2 1 2 3
       4 3 2 1 2 3 4
     5 4 3 2 1 2 3 4 5    


            */

            //Answer

        //      int n=5; 
        //      for(int i=1; i<=n; i++){
        //         //Spaces
        //         for(int j=1; j<=n-i; j++){
        //             System.out.print(" ");
        //         }
        //         //1st half numbers
        //         for(int j=i; j>=1; j--){
        //             System.out.print(j);
        //         }
        //         //2nd half 
        //         for(int j=2; j<=i; j++){
        //             System.out.print(j);
        //      }
        //      System.out.println();


        // }


          
            //Question 4
        //Print the following pattern (Diamond Pattern)
        
        /*

            *
           ***
          *****
         *******
         *******
          *****
           ***
            *


            */

            //Answer


            int n = 4;
            for(int i=1; i<=n; i++){
                //Spaces
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                //Stars
                for(int j=1; j<=2*i-1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            //lower half

            for(int i=n; i>=1; i--){
                //Spaces
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                //Stars
                for(int j=1; j<=2*i-1; j++){
                    System.out.print("*");
                }
                System.out.println();


        




            }

        
        
    }
}