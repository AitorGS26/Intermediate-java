package classes;

/*Here is the thing. 

 * Below you've commented two cases for looking at them.

 * The first one it's a simple print, with a text doing the reference that this is doughter's hello method.

 * But, if you uncomment the second one, and let the first print commented, when you 
 go to the main class, and print doughter's hello method, if the first one is uncommented
 it will appear that message, if the second one, the one with super is uncemmented,
 it ill appear fathers text and not daugter's.*/
public class doughterClass extends fatherClass {

    public void hello() {
        //System.out.println("I'm the doughter, hi all");
        //super.hello();        
    }
    /*The main class is using with extends the father class, inside of the hello method,
     there is a simple print and also super calling to father's hello method.

     * The main class calls to doughter's hello method, the one who has two commented lines
     this method, will initially print the doughters print, but if the uncommented is the second,
     when the main method calles doughte's hello method, this at the same time
     will ask to father's hello method, showing the father's message.*/
}