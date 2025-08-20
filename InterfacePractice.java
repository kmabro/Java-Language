// interface Shape {
//     double calculateArea();
//     double calculatePerimeter();
// }

// class Circle implements Shape {
//     double calculateArea(int r) {
//         return 3.14 * r * r;
//     }

//     double calculatePerimeter(int r) {
//         return 2 * 3.14 * r;
//     }

//     @Override
//     public double calculateArea() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'calculateArea'");
//     }

//     @Override
//     public double calculatePerimeter() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'calculatePerimeter'");
//     }
// }

// class Rectangle implements Shape {
//     double calculatePerimeter(int l, int w) {
//         return 2 * (l + w);
//     }

//     double calculateArea(int l, int w) {
//         return l * w;
//     }

//     @Override
//     public double calculateArea() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'calculateArea'");
//     }

//     @Override
//     public double calculatePerimeter() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'calculatePerimeter'");
//     }
// }

// public class InterfacePractice {
//     public static void main(String[] args) {
//        Circle c = new Circle();
//        System.out.println(c.calculateArea(5));
//        System.out.println(c.calculatePerimeter(5));
//     }
// }
