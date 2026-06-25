import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.trim().split(" ");


        int wordCount = words.length;
        String longestWord = words[0];

        for(String word : words){
            if(word.length()> longestWord.length()){
                longestWord = word;
            }
        }

        String reversedSentence = new StringBuilder(sentence).reverse().toString();

        System.out.println("Number of words: "+wordCount);
        System.out.println("Longest word: "+longestWord);
        System.out.println("Reversed sentence: "+ reversedSentence);
    }
}