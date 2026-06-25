public class RegularMeal extends Meal{
    boolean isVegetarian;

    public RegularMeal() {
        super();
        this.isVegetarian = true;
    }

    public double calculateBill() {
        return 10.00 * quantity;
    }

    public void displayOrderDetails() {
        System.out.println("--- Regular Meal ---");
        super.displayOrderDetails();
        System.out.println("Meal Type: " + (isVegetarian ? "Vegetarian" : "Non-Vegetarian"));
        System.out.println("Total Bill: $" + calculateBill());
        System.out.println("Bill with $2 coupon: $" + (calculateBill() - 2));
    }
}
