public class Main {
    public static void main(String[] args) {

        int i = 0; // rows
        while(i<5){
            int j = 0; // columns
            while(j<5){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }


        System.out.println();
        System.out.println();
        System.out.println();



        for(int row = 1; row<=5;row++){  // hight of trangle(rows)
            for(int s=5-row;s>0;s--){   // spaces (to get star in to the middle of the row)
                System.out.print(" ");
            }

            for(int star = 1;star <= row; star++){
                System.out.print("* ");// print star
            }
            System.out.println();
        }

    }
}