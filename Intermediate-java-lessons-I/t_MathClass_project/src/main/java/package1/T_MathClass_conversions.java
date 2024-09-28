package package1;

public class T_MathClass_conversions {

    public static void main(String[] args) {
        double degreeAngle = 90;
        double radiansAngle = Math.toRadians(degreeAngle);
        System.out.println("Deg to rad: " + degreeAngle + "º = " + radiansAngle + " rad");

        degreeAngle = Math.toDegrees(radiansAngle);
        System.out.println("Rad to deg " + radiansAngle + " rad = " + degreeAngle + "º");
    }
}
