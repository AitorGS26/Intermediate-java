public class cc_OOP_Object_Oriented_Programming_logical {
/*Here we create 3 variables, f for first, s cor second and answ for
the answer of the adding, we create them as private.*/
    private int first, second, answ;
/*After that, we need a constructor, and inside (), we add the variables we've created
inside the main class. */
    public cc_OOP_Object_Oriented_Programming_logical(int first, int second){
/*Inside the constructor we relate the variables we've just created here
with the ones in the main class, we use this for saying the program this is the one i need*/
        this.first = first;
        this.second = second;
    }
/*After that, we do another class for the operation, as below.*/
     public void operation(){
        answ = first + second;
     }
     //finally a class for the printing, we want to print operation.
     public void print(){
        operation();
         System.out.println("The answer is: "+ answ);
     }
     //then we return to the main calsss.
}
