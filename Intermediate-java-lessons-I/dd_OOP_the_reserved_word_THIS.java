
public class dd_OOP_the_reserved_word_THIS {

    /*We declare the variables we've declared before + one called "answer" which is for the 
     part where the program will do the calculations.*/
    private int base, height, answer;

    /*Here we receive the data of base and height, from the main method
     * we make it public, for allowing the main class to see what's inside the method.     */
    public dd_OOP_the_reserved_word_THIS(int base, int height) {
        this.base = base;
        this.height = height;
    }

    /*Here with the info saved from the received data from main class, we do a method for the operation 
     * we want to do, in this case an area of a rectangle*/
    public void operation() {
        answer = base * height;
    }

    /*We add another method, for printing the answer, public, for allowing main class to see it.
     * inside of it we call operation(); method, for having the info this method have inside
     * Then we add a message for the user*/
    public void print() {
        operation();
        System.out.println("The area of the rectangle is: " + answer + " cm2");
    }
    //Now we return to the main class
}
