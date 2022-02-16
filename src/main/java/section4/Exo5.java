package section4;

public class Exo5 {

    public static void main(String[] args) {


        System.out.println(areEqualByThreeDecimalPlaces(10.520, 10.520));
        System.out.println(areEqualByThreeDecimalPlaces(10.123, 10.456));
        System.out.println(areEqualByThreeDecimalPlaces(10.5, 10.5));

    }

    private static boolean areEqualByThreeDecimalPlaces(double param1, double param2) {

        param1 = param1*1000;
        param2 = param2*1000;

        int a1 = (int) param1;
        int b1 = (int) param2;

        if (a1 == b1){
            return true;
        }
        return false;
    }
}
