package package1;

public class T_MathClass_conversions {

    public static void main(String[] args) {
        double degreeAngle = 90;//we set the degrees of the angle
        double radiansAngle = Math.toRadians(degreeAngle); 
        //with math now we change it to radians and save it inside of radiansAngle
        System.out.println("Deg to rad: " + degreeAngle + "º = " + radiansAngle + " rad");
        //then we print all of it

        degreeAngle = Math.toDegrees(radiansAngle);//here we do the same but in the other way
        System.out.println("Rad to deg " + radiansAngle + " rad = " + degreeAngle + "º");
    }
}
