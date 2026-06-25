import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Seconds: ");
        int seconds = sc.nextInt();
        sc.nextLine();

        int hours = seconds / 3600;
        int minutes = (seconds % 3600)/ 60;
        int remainingSeconds = seconds % 60;

        System.out.println("Hours: "+hours);
        System.out.println("Minutes: "+ minutes);
        System.out.println("Seconds: "+ remainingSeconds);
    }
}
