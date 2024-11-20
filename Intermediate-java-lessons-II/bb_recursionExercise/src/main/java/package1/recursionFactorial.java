package package1;

public class recursionFactorial {

    /*We are working with small numbers, this is the reason we use int and class and not long or BigInteger for calculating the recursion.
      
     * Starting with factorial method, it takes an integer called value (which will be user's decision) and returns factorial number calculated*/
    public int factorial(int value) {

        /*We've seen that a factorial doesn't multiply with 0, so the if statement will work always if value is > 0 */
        if (value > 0) {

            /*Here is the heart of the calculation, it multiply the current value with the factorial's value-1, this will occur until the if statement is met
         * 
         * now with factorial number calculated, we need to retur that valuewith return valueCalculation
             */
            int valueCalculation = value * factorial(value - 1);
            return valueCalculation;
        }

        /*This is the base case of the recursion. When value reaches 0, the factorial is 1, so the method returns 1.
        This stops the recursive calls, if not it will be looping since the program crashes.*/
        return 1;
    }
}
