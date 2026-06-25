public class Main {
    public static void main(String[] args) {

        Driver d1 = new Driver("D1001","John Smith",4000.0,5);
        Driver d2 = new Driver("D1002","Emily Davis",3500.0,3);
        Driver d3 = new Driver("D1003","Michael Johnson",5000.0,1);

        d1.display();
        d2.display();
        d3.display();

        double customBonus = d3.calculateBonus(4);
        System.out.println("Bonus for driver3 with custom rating 4: " + customBonus);
        
    }
}
