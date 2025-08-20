public class Main {
    public static void main(String[] args) {
        // Create a user
        OnlineShopUser user = new OnlineShopUser("John Doe");
        
        // Create some products
        Clothing shirt = new Clothing("T-Shirt", 25.99);
        Electronics laptop = new Electronics("Laptop", 999.99);
        
        // Add products to cart
        System.out.println("=== Adding products to cart ===");
        user.addToCart(shirt);
        user.addToCart(laptop);
        
        // Display cart contents
        System.out.println("\n=== Cart contents ===");
        user.displayCart();
        
        // Checkout
        System.out.println("\n=== Checkout ===");
        user.checkout();
    }
}
