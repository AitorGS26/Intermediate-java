/* Make a program that asks the user for a word or a phrase and then print
* the word or phrase in two ways, normally and inverted*/
import java.util.Scanner;

public class a_coding_logic_exercise {
    public static void main (String[]args) {
     String word = "", invertedWord = "";
     int wordLength = 0;
     Scanner input = new Scanner(System.in);

        System.out.print("Write a word or phrase: ");
        word = input.nextLine();

        wordLength = word.length();

        while(wordLength !=0){
            invertedWord += word.substring(wordLength -1, wordLength);
            wordLength--;
        }
        System.out.println("Inverted word: " + invertedWord);
        System.out.println("Original word: " + word);

    }
}