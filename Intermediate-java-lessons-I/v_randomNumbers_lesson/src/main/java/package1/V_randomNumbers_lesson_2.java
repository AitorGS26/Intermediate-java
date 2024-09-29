package package1;
//For the second way of printing random numbers, we'll use Random library.

import java.util.Random;

public class V_randomNumbers_lesson_2 {

    public static void main(String[] args) {

        int random = 0;//We start declaring our object random

        Random rnd = new Random(); //For having comunication with Random library, we add a new object called rnd.
        random = (int) (rnd.nextDouble() * 100);/*Then our object random will have saved
        rnd, Random library's object with .nextDouble method *100, random number between 0 an 100 also.*/
        System.out.println(random);
    }
}
