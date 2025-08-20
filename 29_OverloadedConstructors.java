package company;

public class Video_29_OverloadedConstructors {
	public static void main(String[] args) {
		
	
		Pizza pizza = new Pizza("thicc crust", "tomato");
		
		System.out.println("Here are the ingredient of your pizza: ");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);
		
		
	}
}
