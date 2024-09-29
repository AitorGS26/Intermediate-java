/*In some of our future projects, we'll be working with numbers, and an amount of them will have
decimals, but imagin printing "pi" number, it will be printing that numer for ever and that's not
the point. In this lesson we'll be learning 5 different ways of delimiting those decimals to an amount 
we need. */
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class u_decimalsDelimitation {

    public static void main(String[] args) {
        double number = 2; //We start declaring "number" the double variable 
        double root = Math.sqrt(number);//and root for knowing it's root

        System.out.println("The root of " + number + "is " + root); // here the result is with out delimiting

        //1- For delimiting the amount of decimals we'll use DecimalFormat. 2 decimals
        DecimalFormat df = new DecimalFormat("#.00");//The zeros mark the amount of decimals of df

        System.out.println("The root of " + number + " is " + df.format(root));

        //2- Using String format. 3 decimals
        System.out.println("The root of " + number + " is " + String.format("%.3f", root));//%.3, root mark the mount of decimals and from where are taken.

        //3- Using Math.round library. 4 decimals
        System.out.println("The root of " + number + " is " + (double) Math.round(root * 10000d) / 10000);

        //4- Using BigDecimal and RoundingMode librarys. 5 decimals
        BigDecimal bd = new BigDecimal(root);
        bd = bd.setScale(5, RoundingMode.HALF_UP);

        System.out.println("The root of " + number + "is " + bd.doubleValue());
    }
}
