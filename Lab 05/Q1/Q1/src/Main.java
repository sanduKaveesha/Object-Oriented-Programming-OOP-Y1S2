import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PizzaOrder order1 = new PizzaOrder("03001","Olivia","Medium",3,true);
        order1.displayOrderDetails();

        PizzaOrder order2 = new PizzaOrder("03002","Noah smith","Large",2,false);
        order2.displayOrderDetails();

        System.out.println("\nEnter the discount percentage: ");
        double percentage = sc.nextDouble();

        System.out.println("Order 02 - Price after the discount: $"+ order2.calculateTotalPrice(percentage));


        PizzaOrder order3 = new PizzaOrder();
        order3.displayOrderDetails();
    }
}