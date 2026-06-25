import java.util.Scanner;
  public class Main{
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          Employee employee = new Employee();

          System.out.print("Enter Employee ID: ");
          employee.setEmployeeId(sc.nextInt());
          sc.nextLine();

          System.out.print("Enter Employee Name: ");
          employee.setName(sc.nextLine());

          System.out.print("Enter Basic Salary: ");
          employee.setSalary(sc.nextDouble());
          sc.nextLine();

          System.out.print("Enter Performance Rating (1-5): ");
          employee.setRate(sc.nextInt());
          sc.nextLine();

          employee.displayEmployeeDetails();

          System.out.println("Bonus: "+employee.calculateBonus());
          System.out.println("Total Salary: "+employee.calculateTotalSalary());




      }
  }

