package package1;

public class T_MathClass_trigonometricFunctions {

    public static void main(String[] args) {

        double result = 0;
        double degreesAngle = 45;
        double radAngle = Math.toRadians(degreesAngle);

        //Sine
        result = Math.sin(radAngle);
        System.out.println("Sine of " + degreesAngle + "º = " + result);

        //Cosine
        result = Math.cos(radAngle);
        System.out.println("Cosine of " + degreesAngle + "º = " + result);

        //Tangent
        result = Math.tan(radAngle);
        System.out.println("Tangent of " + degreesAngle + "º = " + result);

        System.out.println("");

        //What if we want the arcSin, actCos and arcTan?
        double value = 0.707;

        //arcSIN
        radAngle = Math.asin(value);
        degreesAngle = Math.toDegrees(radAngle);
        System.out.println("ArcSin of " + value + " = " + degreesAngle + "º");

        //arcCOS
        radAngle = Math.acos(value);
        degreesAngle = Math.toDegrees(radAngle);
        System.out.println("ArcCos of " + value + " = " + degreesAngle + "º");

        //arcTAN
        radAngle = Math.atan(value);
        degreesAngle = Math.toDegrees(radAngle);
        System.out.println("ArcTAN of " + value + " = " + degreesAngle + "º");
    }

}
