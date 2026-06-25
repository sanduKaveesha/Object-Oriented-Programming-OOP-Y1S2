import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] numbers = new int[5];

        System.out.println("Enter 5 integers: ");
        for(int i=0;i<5;i++){
            numbers[i] = sc.nextInt();
        }

        int largest = numbers[0];
        int sum = 0;

        for(int i=0; i<5;i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
            sum += numbers[i];
        }

        System.out.println("The largest value is: "+ largest);
        System.out.println("The sum of all elements: "+ sum);

    }
}