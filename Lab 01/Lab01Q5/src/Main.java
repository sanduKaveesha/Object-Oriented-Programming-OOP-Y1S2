
public class Main {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

    int m1 = cal.multiply(3,4);
    int m2 = cal.multiply(5,7);
    int sum1 = cal.add(m1,m2);
    int result1 = cal.square(sum1);

        System.out.println("(3*4 + 5*7)^2      :  "+ result1);

        int sum2 = cal.add(4,7);
        int squ1 = cal.square(sum2);

        int sum3 = cal.add(8,3);
        int squ2 = cal.square(sum3);

        int result2 = cal.add(squ1, squ2);

        System.out.println();
        System.out.println("(4+7)^2 + (8+3)^2  :  "+ result2);

        
    }
}