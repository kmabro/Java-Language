
// // class outer{
// // int x =10;
// //  class inner{
// //         void if1(){
// //             System.out.println("I am Inner. ");
// //         }
// //     }
// // }

// // public class InnerClassPratice {
// // public static void main(String[] args) {
    
   
// //     //outer.inner i = new outer.inner(); when using static with inner
// //     //i.if1();


// //     //When non-static
    
// //     outer o = new outer();
// //     outer.inner i = o.new inner();
// //     i.if1();
// //     System.out.println(o.x);
   

// // }
    
// // }




// //*************************************** */

// class Person{
    
//    static class Heart{
//         void beat(){
//             System.out.println("Heart is beating. ");
//         }
//     }
// }


// public class InnerClassPratice{
//     public static void main(String[] args) {
        
//     //    Person p = new Person();
//     //    Person.Heart h = p.new Heart();

//         Person.Heart h = new Person.Heart();
//        h.beat(); 


//     }
// }