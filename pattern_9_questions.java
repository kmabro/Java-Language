//import java.util.Scanner;

public class pattern_9_questions {
    public static void main(String[] args) {

        /********************************/

        // Question 1
        // Print the following pattern
        /*  
            *****
            *****
            *****
            *****
        */

        // Answer
        // for(int i=1; i<=4; i++){
        // for(int j=1; j<=5; j++){
        // System.out.print("*");
        // }
        // System.out.println(" ");
        // }

        /********************************/

        // Question 2
        // Print the follwing pattern (Hollow Ractangle)

        /*
         *****
         * 
         * *
         * *
         *****
         * 
         */

        // Answer

        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 1; j <= 5; j++) {
        //         if (i == 1 || j == 1 || i == 4 || j == 5) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }

        //     }
        //     System.out.println();

        // }

        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 1; j <= 5; j++) {
        //         if (i == 1 || j == 1 || j == 5 || i == 4) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }

        //     }
        //     System.out.println();
        // }

        /********************************/

        // Question 3
        // Print the follwing pattern (Half Pyramid)

        /* 

         * 
         **
         ***
         ****

        //  */
        //     int n =4;
        //     for(int i=1; i<=n; i++){
        //         for(int j=1; j<=i; j++){
        //             System.out.print("*");
        //         }
        //        System.out.println();
        //     }
        //     System.out.println();

        // for(int i=1; i<=4; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /********************************/

        //Question 4
        //Print the following pattern (Inverted Half Pyramid)
        /*

         ****
         ***
         **
         *
         
         */

         //Answer

        //  for(int i=4; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //  }


        
        /********************************/

        //Question 5
        //Print the following pattern (Inverted Half Pyramid)(rotated by 180 degree)
        
        /*

            *
           **
          ***
         ****

            */

            //Answer


        // int n=4;
        // for(int i= 1; i<=n; i++){
        //     for(int j=1 ; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++ ){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



        /********************************/

        //Question 6
        //Print the following pattern (Half Pyramid with numbers)

        /*
          1
          12
          123
          1234
          12345

         */


         //Answer

        //  for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i ;j++){
        //         System.out.print(j +" ");
        //     }
        //     System.out.println();
        //  }



        //Question 7
        //Print the following pattern (Inverted Half Pyramid with numbers)
        
        /*

           12345
           1234
           123
           12
           1

            */

            //Answer


            // for(int i=5; i>=1; i--){
            // for(int j=1; j<=i; j++){
            //         System.out.print(j);
            //     }
            //     System.out.println();
            // }

            // System.out.println();
            // int n=5;
            // for(int i=1; i<=n; i++){
            //     for(int j=1; j<=n-i+1; j++){
            //             System.out.print(j);
            //         }
            //         System.out.println();
            //     }




            //Question 8
        //Print the following pattern (Floyd's Triangle)
        
        /*

           1 
           2 3 
           4 5 6
           7 8 9 10
           11 12 13 14 15

            */

            //Answer

        //    int n=5; 
        //    int number = 1; 
        //    for(int i=1; i<=n; i++){
        //     for(int j= 1; j<=i; j++){
        //         System.out.print(number +" ");
        //        number++;
        //     }
        //     System.out.println();
        //    }


            //Question 9
        //Print the following pattern (0-1 Triangle)
        
        /*

           1 
           0 1
           1 0 1
           0 1 0 1
           1 0 1 0 1

            */

            //Answer

        
            int n=5;
            for( int i=1 ; i<= n ; i++){
                for (int j=1; j<=i; j++){

                    int sum= i+j;
                    if(sum % 2==0){
                        System.out.print("1 ");
                    }else{
                        System.out.print("0 ");
                    }
                   
                }
                System.out.println();
            }


    }

}
