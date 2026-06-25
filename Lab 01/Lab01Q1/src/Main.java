public class Main {
    public static void main(String[] args) {

    MarathonDistance m1=new MarathonDistance();

    m1.miles =26;
    m1.yards =385;

    m1.calculateKilometers();

        System.out.println("Distance in kilometers: "+ m1.kilometers);

    }
}