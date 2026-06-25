import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0; i<5;i++){
            System.out.print("Enter number "+(i+1)+": ");
            arr[i] = sc.nextInt();

        }

        int max = arr[0];
        int sum = 0;

        for(int i=0;i<5;i++){
            if(max>arr[i]){
                max = arr[i];
            }
            sum = sum+arr[i];
        }

        System.out.println("The largest value is: "+max);
        System.out.println("The sum of the elements: "+sum);

    }
}