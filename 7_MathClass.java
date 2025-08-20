package company;
import java.util.*;

public class Video_7_MathClass {
	public static void main(String[] args) {
		
//		double x = 3.14;
//		double y = -10; 
//		
//		double z = Math.max(x, y);
//		double a = Math.abs(y);
//		double b = Math.sqrt(x);
//		double c = Math.round(x);
//		double d = Math.ceil(x);
//		double e = Math.floor(x);
//		
//		System.out.println(z);
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
		
//		Program to find hyp: or triangle
		
		double x; 
		double y; 
		double z;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter side x: ");
		x = sc.nextDouble();
		System.out.print("Enter side y: ");
		y = sc.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		System.out.println("The Hyp: of "+x + " and "+y +" is "+z);
		
		sc.close(); 
		
		
		
	}

}
