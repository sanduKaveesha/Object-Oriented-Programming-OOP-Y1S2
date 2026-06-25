import java.util.Scanner;
public class Main{
    public static void main(String[] args){

         Scanner sc = new Scanner(System.in);
         String[] words = new String[5];

        for(int i=0; i<5; i++){
            System.out.print("Enter word "+(i+1)+": ");
            words[i] = sc.nextLine();
        }

        String longest = words[0];
        int totalChars = 0;

        for(int i=0; i<5; i++){
            totalChars += words[i].length();

            if(words[i].length()>longest.length()){
                longest = words[i];
            }
        }

        System.out.println();
        System.out.println("Longest word: "+longest);
        System.out.println("Total characters: "+ totalChars);
        System.out.println("Words with an even number of characters: ");

        for(int i=0;i<5;i++){
            if(words[i].length() % 2 == 0){
                System.out.println(words[i]);
            }
        }


    }
}