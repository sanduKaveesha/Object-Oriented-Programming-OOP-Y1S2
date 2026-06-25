import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p = new Product();

        System.out.print("Enter Product ID: ");
        p.setProductId(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        p.setProductName(sc.nextLine());

        System.out.print("Enter Price: ");
        p.setPrice(sc.nextDouble());
        sc.nextLine();

        System.out.print("Enter quantity: ");
        p.setQuantity(sc.nextInt());
        sc.nextLine();

        p.displayDetails();

        System.out.println("Total Stock value: "+p.calculateTotalValue());
    }
}