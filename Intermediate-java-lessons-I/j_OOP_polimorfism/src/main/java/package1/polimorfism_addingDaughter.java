package package1;
//For having access to previous programmed father class, we add extends and father class name

public class polimorfism_addingDaughter extends polimorfism_father {

    /*override is for rewrite an abstract method from other class, normally the father class.
previously I told you in an abstract method we can't declare anything, for that is override
 it gives the doughter class to write here the logic of the progran, for this specific doughter class
     */
    @Override
    public void operations() {

        result = valueOne + valueTwo;
    }
    //We add the mathematic operation and we do the same with another doughter class for subtraction
}
