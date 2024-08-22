package classes;
/*Here is the thing. 
 * Below you've commented two cases for looking at them.
 * The first one it's a simple print, with a text doing the reference that this is doughter's hello method.
 * BUt, if you uncomment the second one, and let the first print commented, when you 
 go tyo the main class, and print doughter's hello method, if the first one is uncommented
 it will appear that message, if the second one, the one with super is uncemmented,
 it ill appear fathers text and not daugter's.
 */
public class doughterClass extends fatherClass {
    public void hello(){
        //System.out.println("I'm the doughter, hi all");
        //super.hello();        
    }    
}
