// interface A {
//     void a();
//     default void d() {
//         System.out.println("Hello");
//     }
// }

// class B implements A {
//     public void a() {
//         int l = 5;
//         int b = 5;
//         int c = l * b;
//         System.out.println(c);
//     }

//     public void d() {
//         System.out.println("Hello haha");
//     }
// }

// public class InterfaceDefaultAndArea {
//     public static void main(String[] args) {
//         B obj = new B();
//         obj.a();
//         obj.d();
//     }
// }
