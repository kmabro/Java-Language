package company;

public class Video_27_Constructors {

	public static void main(String[] args) {
		
		Human human1 = new Human("Rick",19, 55);
		Human human2 = new Human("Khan M", 19 , 44.5);
		
//		System.out.println(human1.name);
//		System.out.println(human2.name);
		
		human2.eat();
		human1.drink();

	}

}
