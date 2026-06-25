public class ComboMeal extends Meal {
    boolean includesDrinkAndDessert;

    public ComboMeal(String orderID, String customerName, int quantity, boolean includesDrinkAndDessert) {
        super(orderID, customerName, quantity);
        this.includesDrinkAndDessert = includesDrinkAndDessert;
    }

    public double calculateBill() {
        double total = 15.00 * quantity;
        if (includesDrinkAndDessert) {
            total += 5;
        }
        return total;
    }

    public void displayOrderDetails() {
        System.out.println("\n--- Combo Meal ---");
        super.displayOrderDetails();
        System.out.println("Includes Drink & Dessert: " + (includesDrinkAndDessert ? "Yes" : "No"));
        System.out.println("Total Bill: $" + calculateBill());
        System.out.println("Bill with $3 coupon: $" + (calculateBill() - 3));
    }

}
