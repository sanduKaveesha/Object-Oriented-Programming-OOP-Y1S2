import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Employee Type(1, 2, or 3): ");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the Basic Salary: ");
        double basicSalary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Overtime Hours (OT hours): ");
        int otHours = sc.nextInt();
        sc.nextLine();


        int otRate = 0;

        if(type==1){
            otRate=1000;
        }else if(type==2){
            otRate=1500;
        }else if(type==3){
            otRate=1700;
        }else{
            System.out.println("Invalid type.");
        }

        double totalSalary = basicSalary + (otHours * otRate);
        System.out.println();


        System.out.println("Total Salary : Rs."+totalSalary);


    }
}