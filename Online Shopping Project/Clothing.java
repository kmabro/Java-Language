class Clothing extends Product{
    public Clothing (String name, double price){
        super(name,price);
    }

@Override

public void displayInfo(){
    System.out.println("Clothing: "+name + " | Price: $"+price);
} 
}