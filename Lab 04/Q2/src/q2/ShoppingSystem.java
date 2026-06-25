package q2;

public class ShoppingSystem {
   public static void main(String[] args) {
        Product product1 = new Product(101,"Laptop");
        Product product2 = new Product(102,"Smart phone",120000.0,"Non-Member");

        product1.displayProductDetails();
        product2.displayProductDetails();
    }
}
