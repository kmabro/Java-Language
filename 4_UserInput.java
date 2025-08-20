package company;
import java.util.*;

import java.util.Scanner;

public class Video_4_UserInput {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		System.out.println("What is your favourite food");
		String food = sc.nextLine();
		
		System.out.println("Hello "+name);
		System.out.println("You are "+age+" years old.");
		System.out.println("Your favourite food is "+food);
	}
}
