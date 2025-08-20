package company;
import java.util.Scanner;

public class Video_11_LogicalOperators {
	public static void main(String[] args){
		
		
//		&& Operator
//		
//		int temp = 45;
//		
//		if(temp>30) {
//			System.out.println("It's hot outside");
//		}
//		else if(temp>=20 &&temp<=30) {
//			System.out.println("It's warm outside");
//		}
//		else {
//			System.out.println("It's cold outside");
//		}
		
		
		
		
//		|| Operator
		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("You are playing a game! Press q or Q to quit");
//		String response = sc.next();
//		
//		if(response.equals("q") || response.equals("Q")){
//			 System.out.println("You quit the game");
//		}
//		else {
//			System.out.println("You are still playing the game *pew pew*");
//		}
//		
//		
//		
//		
//		
//		
//		! Operator
		
		Scanner sc= new Scanner(System.in);
		System.out.println("You are playing a game! Press q or Q to quit");
		String response = sc.next();
		
		if(!response.equals("q") && !response.equals("Q")){
			 System.out.println("You quit the game");
		}
		else {
			System.out.println("You are still playing the game *pew pew*");
		}
		
		
	}

}
