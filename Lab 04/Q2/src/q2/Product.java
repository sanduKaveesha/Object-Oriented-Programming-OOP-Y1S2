package q2;

public class Product {
    int productID;
    String productName;
    double bestPrice;
    String membershipType;


    public Product(int productID, String productName) {
        this.productID = productID;
        this.productName = productName;
        this.membershipType = "Non-Member";
    }
    public Product(int productID, String productName, double bestPrice) {
        this.productID = productID;
        this.productName = productName;
        this.bestPrice = bestPrice;
        this.membershipType = "Non-Member";
    }
    public Product(int productID, String productName, double bestPrice,String membershipType) {
        this.productID = productID;
        this.productName = productName;
        this.bestPrice = bestPrice;
        setMembershipType(membershipType);
    }

    public String getMembershipType() {
        return membershipType;
    }

    public double getBestPrice() {
        return bestPrice;
    }

    public void setBestPrice(double bestPrice) {
        this.bestPrice = bestPrice;
    }

    public void setMembershipType(String membershipType) {
        if(membershipType.equalsIgnoreCase("Premium")|| membershipType.equalsIgnoreCase("Regular")|| membershipType.equalsIgnoreCase("Non-Member")){
            this.membershipType=membershipType;
        }else{
            this.membershipType="Non-Member";
        }
    }
    double calculateFinalPrice(){
        double discount=0;
        if(membershipType.equalsIgnoreCase("Premium")){
            discount = 0.20;
        }else if(membershipType.equalsIgnoreCase("Regular")){
            discount = 0.1;
        }
        return bestPrice - (bestPrice*discount);
    }
    double calculateFinalPrice(double seasonalDiscount){
        double priceAfterSeasonalDiscount = calculateFinalPrice();
        return priceAfterSeasonalDiscount - (priceAfterSeasonalDiscount*seasonalDiscount/100);
    }
    void displayProductDetails(){
        System.out.println("Product ID: "+productID);
        System.out.println("Product Name: "+productName);
        System.out.println("Base Price: "+getBestPrice());
        System.out.println("Membership Type: "+getMembershipType());
        System.out.println("Final Price (After Discount): "+calculateFinalPrice());
    }
}
