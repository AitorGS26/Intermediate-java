package com.ee_OOP_encapsulation_Logic; //package, this is important, it's a point of conecction between this (the logic part, and the test part)

public class ee_OOP_encapsulation_Logic {

    private int kg = 0, full = 0, clotheType = 0, washCompleted = 0, dryCompleted = 0; //we declare the variables, privately.


    public ee_OOP_encapsulation_Logic(int kg, int clotheType){ //this is a public constructor so the other programmer will iteract with this one

        this.kg = kg;
        this.clotheType = clotheType;
        /*"this" is a reserved word in Java. It is used to refer to the current instance of the class within which it is being used.*/
    }
    private void filling(){ //we declare the first function, filling the washing machine
        if(kg <=30){//max 30kg
            full = 1;//before we've declared full as 0 for empty washing machine, now 1 refers to full or charge.
            System.out.println("Filling the washer...");
            System.out.println("fill completed");
        }else{
            System.out.println("The amount of clothes is exceeding the capacity");
        }
    }
    private void wash(){ //second function, whash
        filling();
        if (full == 1) {
            if (clotheType == 1) {
                System.out.println("White clothes / smooth wash");
                System.out.println("Washing...");
                washCompleted = 1;
                }else if(clotheType == 2) {
                System.out.println("Color clothes / intense wash");
                System.out.println("Washing...");
                washCompleted =1;        
                } 
        }else{
            System.out.println("The type of clothes is not available");
            System.out.println("It will be washed as color clothes");
            washCompleted = 1;
        }
    }
    private void dry(){ //finally third function, dry
        wash();
        if (washCompleted == 1) {
            System.out.println("Wash finished, drying...");
            dryCompleted = 1;            
        }
    }
    public void finishedCycle(){ // this is the only function next programmer will see.
        dry();
        if (dryCompleted == 1) {
            System.out.println("Your clothes are ready");            
        }
    }
    //setter and getter methods, refactor

    public int getclotheType(){ //Starting with get mehtod, with a name in my election, for better understanding i called it clotheType
        return clotheType; //we need a return in every get method
    }

    public void setclotheType(int clotheType){ //set method always have a void, and inside of it i created another variable, with same name for better understanding
        this.clotheType = clotheType; //we compare two variables for giving all to the programmer
    }
   
}
