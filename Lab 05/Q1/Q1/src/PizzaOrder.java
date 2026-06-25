public class PizzaOrder {

    private String orderID;
    private String name;
    private String size;
    private int toppingCount;
    private boolean isDelivery;

    public PizzaOrder(){
        orderID="000";
        name="unknown";
        size="small";
        toppingCount=0;
        isDelivery=false;

    }

    public PizzaOrder(String orderID,String name){
        this.orderID=orderID;
        this.name=name;
        size="small";
        toppingCount=0;
        isDelivery=false;
    }

    public PizzaOrder(String orderID, String name, String size, int toppingCount, boolean isDelivery) {
        this.orderID = orderID;
        this.name = name;
        this.size = size;
        this.toppingCount = toppingCount;
        this.isDelivery = isDelivery;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if(size.equalsIgnoreCase("Small")||size.equalsIgnoreCase("Medium")||size.equalsIgnoreCase("Large")) {
            this.size = size;
        }else{
            this.size = "Small";
        }
    }

    public double getBasePrice(){
        if(size.equalsIgnoreCase("Small")){
            return 8.0;
        } else if (size.equalsIgnoreCase("Medium")) {
            return 10.0;
        }else{
            return 12.0;
        }
    }

    public double calculateTotalPrice(){
        double total= getBasePrice();

        total+= toppingCount*1.5;

        if(isDelivery){
            total += 5.0;
        }
        return total;
    }
    public double calculateTotalPrice(double discountPercentage){
        double total = calculateTotalPrice();
        return total - (total*discountPercentage/100);
    }

    public int estimatePreparationTime(){
        return 15 + (2* toppingCount);
    }

    public  void displayOrderDetails(){
        System.out.println("\n___ Order Details ___");
        System.out.println("Order ID: "+orderID);
        System.out.println("Customer Name: "+name);
        System.out.println("Size: "+ size);
        System.out.println("Toppings: "+toppingCount);
        System.out.println("Delivery: "+(isDelivery ? "Yes": "No"));
        System.out.println("Total Price: $"+calculateTotalPrice());
        System.out.println("Preparation Time: "+ estimatePreparationTime() + " minutes");

    }

}
