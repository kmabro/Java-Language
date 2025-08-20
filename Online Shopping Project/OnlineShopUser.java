class OnlineShopUser implements User{
    private String name;
    private ShoppingCart cart = new ShoppingCart();
    public OnlineShopUser(String name){
        this.name = name;
    }
    @Override
    
public void addToCart(Product product) {
    cart.addProduct(product);
}

@Override

public void checkout(){
    double total = cart.calculateTotal();
    System.out.println(name + " checked out. Total amount: $"+total);
    cart.clearCart();
}

public void displayCart(){
    cart.displayCart();
}
}
