package company;

public class Video_3_SwapTwoVariables {

	public static void main(String[] args) {
		
		String x = "Water";
		String y = "Cocacola";
		String temp;
		
		temp = x; 
		x= y; 
		y=temp;
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);

	}

}
