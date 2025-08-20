package company;

public class Video_20_2DArrayList {
	public static void main(String[] args) {
		
		  ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

	        ArrayList<String> bakeryList = new ArrayList<String>();
	        bakeryList.add("Pasta");
	        bakeryList.add("garlic bread");
	        bakeryList.add("donuts");

	        ArrayList<String> produceList = new ArrayList<String>();
	        produceList.add("tomatoes");
	        produceList.add("zucchini");
	        produceList.add("peppers");

	        ArrayList<String> drinksList = new ArrayList<String>();
	        drinksList.add("soda");
	        drinksList.add("coffee");
	      

	        groceryList.add(bakeryList);
	        groceryList.add(produceList);
	        groceryList.add(drinksList);

	       System.out.println(groceryList.get(0));


		
		
	}
}
