public class Employee {
    private int employeeId;
    private String name;
    private double salary;
    private int rate;

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if(salary>0) {
            this.salary = salary;
        }else{
            System.out.println("Salary should be positive.");
        }
    }

    public void setRate(int rate) {
        if(rate>= 1 && rate <=5) {
            this.rate = rate;
        }else{
            System.out.println("Performance Rating should be between 1 and 5");
        }
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getRate() {
        return rate;
    }

    public void displayEmployeeDetails() {
        System.out.println("\nEmployee Details: ");
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Name: " + getName());
        System.out.println("Basic Salary: " + getSalary());
        System.out.println("Performance Rating: " + getRate());

    }

    public double calculateBonus() {
        if (rate == 1) {
            return 0;
        } else if (rate == 2) {
            return (salary * 0.05);
        } else if (rate == 3) {
            return (salary * 0.1);
        } else if (rate == 4) {
            return (salary * 0.15);
        } else {
            return (salary * 0.2);
        }


    }

    public double calculateTotalSalary(){
        return calculateBonus()+ salary;
    }

}