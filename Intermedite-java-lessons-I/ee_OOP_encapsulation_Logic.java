import java.sql.SQLOutput;

public class ee_OOP_encapsulation_Logic {

    private int kg = 0, full = 0, clotheType = 0, washCompleted = 0, dryCompleted = 0;


    public class ee_OOP_encapsulation_Logic(int kg, int clotheType){

        this.kg = kg;
        this clotheType = clotheType;
    }
    private void filling(){
        if(kg <=30){
            washCompleted = 1;
            System.out.println("Filling the washer...");
            System.out.println("fill completed");
        }else{
            System.out.println("The amount of clothes is exceeding the capacity");
        }
    }
    private void wash
}
