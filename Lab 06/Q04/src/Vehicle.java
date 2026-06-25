public class Vehicle {
    String vehicleName;

    public Vehicle(){
        vehicleName="Unknown";
    }

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void displayVehicleDetails() {
        System.out.println("Vehicle Name: " + vehicleName);

    }
    public double calculateSpeed(){
        return 0.0;
    }

    public double calculateSpeed(double factor){
        return calculateSpeed() * factor;
    }
}