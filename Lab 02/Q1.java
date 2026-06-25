import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee type(1,2 or 3): ");
        int type = sc.nextInt();

        System.out.print("Enter basic salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter overtime hours: ");
        int otHours = sc.nextInt();

        double otRate = 0;

        if (type==1){
            otRate = 1000;
        }else if (type==2){
            otRate = 1500;
        }else if (type==3){
            otRate = 1700;
        }else{
            System.out.println("Invalid employee type!");
            return;
        }

        double totalSalary = salary + (otHours*otRate);

        System.out.print("Total Salary: "+ totalSalary);
    }
}