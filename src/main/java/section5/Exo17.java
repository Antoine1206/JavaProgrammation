package section5;


public class Exo17 {

    public static void main(String[] args) {


        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    private static int getEvenDigitSum(int number) {

        int reverseNumber = 0;
        int lastDigit = 0;
        int sum = 0;

        if (number > 0) {
            while (number != 0) {
                lastDigit = number % 10;
                if (lastDigit % 2 == 0) {
                    sum = sum + lastDigit;
                }
                reverseNumber = reverseNumber * 10 + lastDigit;
                number /= 10;
            }
            return sum;
        }
        return -1;
    }
}
