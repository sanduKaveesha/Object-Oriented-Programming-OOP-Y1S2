import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        int wordCount = 0; // counts total words
        int maxLength = 0; // length of longest word
        String currentWord = ""; // Temporary String to build one word without space


        //First loop--> count words and find max word length
        for(int i=0;i<sentence.length();i++){
             char ch = sentence.charAt(i);// get each character of the sentence

             if(ch != ' '){
                 currentWord = currentWord + ch;
             }else{                // if the character is a space,the word has ended
                 wordCount++;

                 // check if the current word is longer than the previous longest
                 if(currentWord.length() >maxLength){
                     maxLength = currentWord.length();
                 }
                 currentWord = ""; // reset currentword to start building the next word
             }
        }

        wordCount++;// count last word (because it won't be followed by a space)

        if(currentWord.length()> maxLength){
            maxLength = currentWord.length();
        }

        String result = "["; // to store longest words
        currentWord = ""; // reset currentWord to reuse for collecting longest words
        boolean first = true; // to add commas


        // Second loop --> collect all longest words
        for(int i=0;i < sentence.length();i++){
            char ch = sentence.charAt(i); // get each character

            if (ch != ' '){  // if not a space. keep adding characters to currentWord
                currentWord = currentWord + ch;
            }else{  // if space, current word ends
                if(currentWord.length()== maxLength){
                    if(!first){ // add a comma if it's not the first word
                        result = result + ", ";
                    }
                    result = result + currentWord;// add word to result
                    first = false;// mark that the first longest word has been added
                }
                currentWord = "";// reset for next word
            }
        }

        // check last word in sentence for longest word
        if(currentWord.length() == maxLength){
            if(!first){
                result = result + ", ";
            }
            result = result + currentWord;
        }

        result = result + "]";

        // Reverse the sentence
        String reversedSentence = new StringBuilder(sentence).reverse().toString();

        System.out.println("Total number of words: "+wordCount);
        System.out.println("Longest word(s): "+ result);
        System.out.println("Reversed sentence: "+ reversedSentence);


    }
}
