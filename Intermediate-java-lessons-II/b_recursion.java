/*In programming recursion is a technique which allows executing some code block "n" times
 * 
 * In java, methods or functions can call themselves, this is possible when inside of a
 method there is an invocation of itself.

 * For example public void example(){
   //instructions
   example();
  }

  * as we can see above, example() function is callingitself inside of itself. this will 
  create an inifinite loop calling itself once and again

  * For controlling it and not beign an inifinite loop, we'll allocate the method 
  inside an if statement, as below. This will call example function five times before exiting recursion

  public void example(){
  //instructions
  if(counter <= 5){
    example();
  }
  }

  For a better understanding go to b_recursionProject

 */
public class b_recursion {

}
