import java.util.List;
import java.util.ArrayList;

class ShoppingCart{
    private List<Product> cart = new ArrayList<>();
    public void addProduct(Product product){
        cart.add(product);
        System.out.println(product.name + " added to cart.");
    }

    public void displayCart(){
        System.out.println("Items in Cart:");
        for(Product product: cart){
            product.displayInfo();
        }
    }
    public double calculateTotal(){
        double total = 0;
        for(Product product: cart){
            total += product.getPrice();
        }
        return total;
    }

    public void clearCart(){
    cart.clear();
   System.out.println("Cart has been cleared.");
    }
        }