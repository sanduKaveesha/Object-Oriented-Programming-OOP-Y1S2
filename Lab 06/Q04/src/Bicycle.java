public class Bicycle extends Vehicle{
    int gearCount;
    double maxPedalSpeed;

    public Bicycle(String name,int gearCount,double maxPedalSpeed){
        super(name);
        this.gearCount = gearCount;
        this.maxPedalSpeed = maxPedalSpeed;

    }

    public double calculateSpeed(){
        return maxPedalSpeed;
    }
    public void displayVehicleDetails(){

        System.out.println("Vehicle Name: "+ vehicleName);
        System.out.println("Gear Count: "+gearCount);
        System.out.println("Max Pedal Speed: "+ maxPedalSpeed+" km/h");
    }

}
