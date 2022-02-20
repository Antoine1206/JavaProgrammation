package section5;

public class Exo18 {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));

    }

    private static boolean hasSharedDigit(int param1, int param2) {

        if (param1 > 10 && param1 < 100 && param2 > 10 && param2 < 100) {

            int lastDigit = 0;
            int reverseNumber = 0;
            int lastDigit2 = 0;
            int reverseNumber2 = 0;


            while (param1 != 0) {
                lastDigit = param1 % 10;
                reverseNumber = reverseNumber * 10 + lastDigit;
                int number2 = param2;
                while (number2 != 0) {
                    lastDigit2 = number2 % 10;
                    reverseNumber2 = reverseNumber2 * 10 + lastDigit2;
                    if (lastDigit == number2){
                        return true;
                    } number2 /= 10;
                }
                param1 /= 10;
            }


        }
        return false;
    }

}
