package section4;

public class ExoOral58 {

    public static void main(String[] args) {

        System.out.println(calcFeetAndInchesTiCentimeters(7, 5));
        System.out.println(calcFeetAndInchesTiCentimeters(100));
    }

    private static double calcFeetAndInchesTiCentimeters(double feet, double inches) {
        if (feet >= 0 || inches >= 0 || inches <= 12){
            double centimeter = (inches * 2.54) + (feet * 12 * 2.54);
            return centimeter;
        }
        return -1;
    }

    private static double calcFeetAndInchesTiCentimeters(double inches) {  //Mouais ct pas ça mais c simple
        if (inches >= 0){
           double testMethodOne = inches / 12;
            return testMethodOne;
        }
        return -1;
    }
}
