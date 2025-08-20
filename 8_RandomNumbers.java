package company;
import java.util.Random;

public class Video_8_RandomNumbers {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int x = random.nextInt(-6,6);
		double y =  random.nextDouble(-6.0,6.0);
		boolean z = random.nextBoolean();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
