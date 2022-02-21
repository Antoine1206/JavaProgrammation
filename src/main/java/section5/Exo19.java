package section5;

public class Exo19 {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

    }

    private static boolean hasSameLastDigit(int param1, int param2, int param3) {


        int lastDigit1 = param1 % 10;
        int lastDigit2 = param2 % 10;
        int lastDigit3 = param3 % 10;

        if (param1 > 10 && param1 < 1000 && param2 > 10 && param2 < 1000 && param3 > 10 && param3 < 1000) {
            if (lastDigit1 == lastDigit2) {
                return true;
            } else if (lastDigit1 == lastDigit3) {
                return true;
            } else if (lastDigit2 == lastDigit3) {
                return true;
            }
            return false;

        }
        return false;


    }


}
