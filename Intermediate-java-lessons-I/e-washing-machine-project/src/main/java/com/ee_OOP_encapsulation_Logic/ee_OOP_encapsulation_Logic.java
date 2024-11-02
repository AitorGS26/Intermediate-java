
/*package, this is important, it's a point of connection between the logic class, and the main class

* When you create a project, the IDE itself will create 1 source package and you'll be 
creating classes inside of that, which will connect themselves.

Furthermore we'll be learning how to relate two or more packages. */
package com.ee_OOP_encapsulation_Logic;

public class ee_OOP_encapsulation_Logic {

    /*We declare the variables or the global atributes taking in account the instructions
    we've received.
    
    *The variables of the logical class are declared privately, this is because those will be 
    atributes our program will have and they won't change, so private give it that posibility, 
    this is a class only we can see.*/
    private int kg = 0, full = 0, clotheType = 0, washCompleted = 0, dryCompleted = 0;

    /*Below's is a public constructor so the other programmer will iteract with this one
     
    * inside of it we receive the info of kg and clothtype, relating them with this classes
     variables, called with the same name.
    
    * As we've seen in the this reserved word lesson.*/

    public ee_OOP_encapsulation_Logic(int kg, int clotheType) {

        this.kg = kg;
        this.clotheType = clotheType;
        /*"this" is a reserved word in Java. It is used to refer to the current 
        instance of the class within which it is being used. It causes a relationship between the
        variables the constructor is receiving from the main class, in this case kg and clotheType*/
    }

    private void filling() { //we declare the first function, filling the washing machine
        if (kg <= 30) {//max 30kg as the company has asked for
            full = 1;/*Above we've declared global variables, full=0; for empty washing machine, now 
            1 refers to full or charge.*/
            System.out.println("Filling the washer...");
            System.out.println("fill completed");
        } else {
            System.out.println("The amount of clothes is exceeding the capacity");
            //If the user put more than 30kg there will show above's message
        }
    }

    private void wash() { //second function, whash
        filling();//we refer to filling class to have that function's info inside of the wash function
        if (full == 1) { //previously we've said when the washer is full full will be =1 so if is filled
            if (clotheType == 1) { //if the user press one for the clothe type
                System.out.println("White clothes / smooth wash");
                System.out.println("Washing...");
                washCompleted = 1; //here the wash changed to 1, wash is completed
            } else if (clotheType == 2) {//if user press two, colour clothes
                System.out.println("Color clothes / intense wash");
                System.out.println("Washing...");
                washCompleted = 1;//wash completed, =1 it's finished        
            }
        } else {//if the user presses an incorrect number
            System.out.println("The type of clothes is not available");
            System.out.println("It will be washed as color clothes");
            washCompleted = 1;//also wash completed
        }
    }

    private void dry() { //finally third function, dry
        wash();//we add the info inside wash, that also have filling method's info inside, 
        if (washCompleted == 1) {//wash method finishes with washcompleted =1 so this is true and starts drying
            System.out.println("Wash finished, drying...");
            dryCompleted = 1;//dry completed            
        }
    }

    /*All the methods has been private, those are the instructions of the washer, is the brain of it
     
    *This is an info only want and have to know the developer, because if someone touches it the 
     washer won't work.*/
    public void finishedCycle() { // this is the only function next programmer will see.
        dry();//We add dry, for having the info inside of it and also inside of wash and fill functions
        if (dryCompleted == 1) {//dry finished with 1 so this is true and it send's the following message
            System.out.println("Your clothes are ready");
        }
    }
    //here finishes the encapsulation lessons's logic part, below is for the next lesson, setter 
    //and getter methods. Here we've to go to starter class.

    //setter and getter methods, refactor
    public int getclotheType() {
        /*Starting with get mehtod, with a name in my election, 
                                   for better understanding i called it clotheType*/
        return clotheType; //the atribute we want to return is the clothe type the user have selected.
    }

    public void setclotheType(int clotheType) {
        /*set method always have a void, this is because
                                                void returs a value and inside of it i 
                                                created another variable, with same name for better 
                                                understanding*/
        this.clotheType = clotheType; //we compare two variables for giving all to the programmer
    }

}
