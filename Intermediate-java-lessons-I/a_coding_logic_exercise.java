/* Make a program that asks the user for a word or a phrase and then print
   the word or phrase in two ways, normally and inverted*/

//We're going to ask the user for data, we've to import Scanner library.
import java.util.Scanner;

public class a_coding_logic_exercise {

    public static void main(String[] args) {

        
        String word = "", invertedWord = "";
        int wordLength = 0;//For the logic of the program
        Scanner input = new Scanner(System.in);//user's input

        /*With all the variables declared
         * String for the word or phrase
         * String for the inverted word or phrase
         * Length of the word or phrase
         * Scanner for user's input
         
         * We start with the functionality of the program, we ask the user for a word 
           or phrase*/
        System.out.print("Write a word or phrase: ");
        word = input.nextLine();
        //We want words so we use .nextLine() - we save that input in "word" variable.

        wordLength = word.length();
        //here we save the lenght of the word or phrase saved in "word" variable

        
        while (wordLength != 0) {
            invertedWord += word.substring(wordLength - 1, wordLength);
            wordLength--;
        }
       
        System.out.println("Inverted word: " + invertedWord);
        System.out.println("Original word: " + word);

    }
}
//MIRAR ESTA.