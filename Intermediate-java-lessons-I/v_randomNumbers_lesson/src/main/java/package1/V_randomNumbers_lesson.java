/*We're going to learn two ways for having an output of random numbers 
 * 
 * This will be with Math.random
 */
package package1;

public class V_randomNumbers_lesson {

    public static void main(String[] args) {
        int random = 0; //we start declaring our object called random

        random = (int) (Math.random() * 100);/*Here is the key, Math.random() * 100 - 
        This will save a random number between 0 and 100 inside or our object random */

        System.out.println(random); //finally we print it
    }
}
