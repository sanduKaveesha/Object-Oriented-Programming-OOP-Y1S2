public class Main{
    public static void main(String[] args) {

        Car car = new Car();
        Bicycle bike = new Bicycle("Mountain Bike",6,40.0);


        System.out.println("Car Speed: "+ car.calculateSpeed());
        System.out.println("Car Speed with factor: "+car.calculateSpeed(1.2));


        System.out.println();

        System.out.println("Bicycle Speed: "+bike.calculateSpeed());
        System.out.println("Bicycle Speed with factor: "+bike.calculateSpeed(1.5));


        System.out.println("\n--- Vehicle Details ---");

        car.displayVehicleDetails();
        System.out.println();
        bike.displayVehicleDetails();

    }
}