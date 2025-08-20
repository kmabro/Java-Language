// import java.util.Scanner;

// public class Two_D_Arrays {
//     public static void main(String[] args) {

        // Scanner km = new Scanner(System.in);
        // int rows = km.nextInt();
        // int cols = km.nextInt();
        // int[][] numbers = new int[rows][cols];

        // for(int i=0; i<rows; i++){
        // for(int j=0; j<cols; j++){
        // numbers[i][j]= km.nextInt();
        // }
        // }

        // for(int i=0; i<rows; i++){
        // for(int j=0; j<cols; j++){
        // System.out.print(numbers[i][j]+" ");

        // }
        // System.out.println();
        // }

//         Scanner km = new Scanner(System.in);
//         int rows = km.nextInt();
//         int cols = km.nextInt();
//         int[][] numbers = new int[rows][cols];

//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 numbers[i][j] = km.nextInt();
//             }
//         }

//         int x = km.nextInt();

//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 if (numbers[i][j] == x) {
//                     System.out.println("x found at location (" + i + ", " + j + ")");
//                 }
//             }
//         }

//     }
// }



/**************************************************/
// import java.util.Scanner;
// public class Two_D_Array { 
//         public static void main(String[] args) { 
//                 Scanner sc= new Scanner (System.in);
//                 for(int i=0; i<10; i++){
//                 int numbers = sc.nextInt();
//                // int [] numbers = {10,20,30,40,50,60,70,80,90,100};
//         }
//                 int max = numbers[0];
//                 int min = numbers[0];

//                 for(int i=1 ; i<numbers.length; i++){

//                        if(numbers[i]>max){
//                         max= numbers[i];
//                        }

//                        if(numbers[i]<min){
//                         min = numbers[i];
//                        }
//                 }
//                 System.out.println("Maximum numbers is: "+ max);
//                 System.out.println("Minimum numbers is: "+ min);

//         }
// }


// class Two_D_Array{
//         public static void main(String[] args) {
//                 int[]numbers = {1,2,3,4,5,6,7,8,9,10};

//                 int max = numbers[0];
//                 int min = numbers[0];

//                 for(int i=1; i<numbers.length; i++){
//                         if(numbers[i] <min ){
//                                 min = numbers[i];
//                         }
//                         if(numbers[i]>max){
//                                 max= numbers[i];
//                         }
//                 }
//                 System.out.println("Maximum number is: "+max);
//                 System.out.println("Minimum number is: "+min);

//         }
// }


class Two_D_Array{
        public static void main(String[] args) {
                
                int [] numbers = {2,4,6,8,10,12,14,16,18,20};
                int max=numbers[0];
                int min=numbers[0];
                for(int i=1; i<numbers.length; i++){
                        if(numbers[i]>max){
                                max= numbers[i];
                        }
                        if(numbers[i]<min){
                                min = numbers[i];
                        }
                }
                System.out.println(max);
                System.out.println(min);
        }
}