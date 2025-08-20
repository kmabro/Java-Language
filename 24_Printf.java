package company;

public class Video_24_Printf {

	public static void main(String[] args) {
		
		//System.out.printf("%d This is a format String ", 123);

		boolean bool = true;
		char ch = '@';
		String st = "Khan";
		int In = 50;
		double Dou = 1000;
		
		//System.out.printf("%b", bool);
		//System.out.printf("%c", ch);
		//System.out.printf("%s", st);
		//System.out.printf("%d", In);
		//System.out.printf("%f", Dou);
		
		
		//System.out.printf("Hello %10s", st);
		
		
		System.out.printf("Hello %.25f", Dou);
		
		
	}

}
