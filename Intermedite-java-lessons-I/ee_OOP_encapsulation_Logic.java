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
    private void wash(){
        filling();
        if (filling == 1) {
            if (clotheType == 1) {
                System.out.println("White clothes / smooth wash");
                System.out.println("Washing...");
                washCompleted = 1;
            }            
        } else if(clotheType == 2){
            System.out.println("Color clothes / intense wash");
            System.out.println("Washing...");
            washCompleted =1;
        }else{
            System.out.println("The type of clothes is not available");
            System.out.println("It will be washed as color clothes");
            washCompleted = 1;
        }
    }
    private void dry(){
        wash();
        if (washCompleted == 1) {
            System.out.println("Wash finished, drying...");
            dryCompleted = 1;            
        }
    }
    public void finishedCycle(){
        dry();
        if (dryCompleted == 1) {
            System.out.println("Your clothes are ready");            
        }
    }
}
