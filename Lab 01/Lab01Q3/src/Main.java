public class Main {
    public static void main(String[] args) {

        EvenOddNumber n1 = new EvenOddNumber();

        int number = 9;

        if(n1.findEvenOrOdd(number)){
            System.out.println(number+" is Even");
        }else{
            System.out.println(number+" is Odd");
        }

    }
}
