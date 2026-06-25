public class RestaurantApp {
    public static void main(String[] args) {

        RegularMeal regular = new RegularMeal();
        ComboMeal combo = new ComboMeal("C102", "Alice Green", 2, true);

        regular.displayOrderDetails();
        combo.displayOrderDetails();

    }
}

