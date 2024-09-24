/* Make a program that asks the user for a word or a phrase and then print
* the word or phrase in two ways, normally and inverted*/

//We're going to ask the user for data, we've to import Scanner library.
import java.util.Scanner;

public class a_coding_logic_exercise {

    public static void main(String[] args) {

        //We are asking for words, so we've to declare the variables we're using, as a string like below.
        String word = "", invertedWord = "";
        int wordLength = 0;//For the logic of the program, we've to know how much letters the word or phrase has.
        Scanner input = new Scanner(System.in);//We declare "input" as scanner object for the user's input

        /*With all the variables declared
         * String for the word or phrase
         * String for the inverted word or phrase
         * Length of the word or phrase
         * Scanner for user's input
         
         * We start with the functionality of the program, we ask the user for a word or phrase*/
        System.out.print("Write a word or phrase: ");
        word = input.nextLine();//We want words so we use .nextLine() - we save that input in "word" variable.

        wordLength = word.length();//here we save the lenght of the word or phrase saved in "word" variable

        /*Finally we start with program's logic, we need  */
        while (wordLength != 0) {/*while word length is not 0(the word or phrase has for example 5 characters)*/

 /*The following line is the one that does the function of inverse the phrase.
             * It works like this:
             * Imagin the word is "Hello"
             * Substring adds the word's length, (startIndex -1, endIndex)
             * startIndex will be 5 this is because hello has 5 characters, -1 that means inverted word will
             add the 4th, in java the fisrt character is always 0, the 4th  so this will be the first character
             of invertedWord.
             * then wordlenght will be -- 1 less so the next time startIndex -1 will be 3, the l letter
             * This will be in the loop since the wordLength is 0, then it will be out ofthe loop
             */
            invertedWord += word.substring(wordLength - 1, wordLength);
            wordLength--;
        }
        /*Now is the variable invertedWord with all the phrase's or word's characters saved but inverted and 
         the program only will print them
         * Same as the phrase or word but as original.
         */
        System.out.println("Inverted word: " + invertedWord);
        System.out.println("Original word: " + word);

    }
}
