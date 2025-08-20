package company;
import java.util.Scanner;

public class Video_12_WhileLoop {
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
	String name = "";
	
//	while(name.isBlank()) {
//		System.out.print("Enter your name: ");
//		name = sc.nextLine();
//	}
//	System.out.println("Hello "+name);
//	
//	


	do {
		System.out.print("Enter your name: ");
		name = sc.nextLine();
	}while(name.isBlank());
	System.out.println("Hello "+name);
	
	}
	
	
}
