package package1;

/*Here on the other side we have done the same operation as in adding one, but here
 after the override, when we wrote down the method, inside of it e've introduced a subtraction.
 Here is where polymorfism acts, on the adding class, the operation was adding, here is 
 subtracting.*/
public class polimorfism_subtractingDaughter extends polimorfism_father {
//override is for rewrite a method from the father.

    @Override
    public void operations() {//we're going to rewrite operations method, for subtraction doughter.

        result = valueOne - valueTwo;
    }
    //After creating this, we create the main class for showing everything
}
