public class Driver{
    private String driverID;
    private String driverName;
    private double baseSalary;
    private int performanceScore;

    public Driver(String driverID, String driverName){
        this.driverID=driverID;
        this.driverName=driverName;
    }

    public Driver(double baseSalary){
        this.baseSalary=baseSalary;
    }

    public Driver(String driverID,String driverName,double baseSalary,int performanceScore){
        this.driverID=driverID;
        this.driverName=driverName;
        this.baseSalary=baseSalary;
        setPerformanceScore(performanceScore);
    }

    public String getDriverID() {
        return driverID;
    }

    public int getPerformanceScore() {
        return performanceScore;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public void setPerformanceScore(int performanceScore) {
        if(performanceScore>=1 && performanceScore<=5) {
            this.performanceScore = performanceScore;
        }else{
            this.performanceScore = 1;
        }
    }

    public double calculateBonus(){
        switch(performanceScore){
            case 5:
                return baseSalary*0.25;
            case 4:
                return baseSalary*0.20;
            case 3:
                return baseSalary*0.15;
            case 2:
                return baseSalary*0.10;
            default:
                return 0;
        }
    }

    public double calculateBonus(int score){
        switch (score){
            case 5:
                return baseSalary*0.25;
            case 4:
                return baseSalary*0.20;
            case 3:
                return baseSalary*0.15;
            case 2:
                return baseSalary*0.10;
            default:
                return 0;
        }
    }

    public double calculateTotalSalary(){
        return baseSalary + calculateBonus();
    }

    public void display(){
        System.out.println("Driver ID: "+driverID);
        System.out.println("Name: "+driverName);
        System.out.println("Base Salary: "+baseSalary);
        System.out.println("Performance Score: "+ performanceScore);
        System.out.println("Bonus: "+calculateBonus());
        System.out.println("Total Salary: "+calculateTotalSalary());
        System.out.println();
    }
}

