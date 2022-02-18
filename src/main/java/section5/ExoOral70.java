package section5;

public class ExoOral70 {


    public static void main(String[] args) {

        System.out.println(sumDigits(125));
        System.out.println(sumDigits(2000));
        System.out.println(sumDigits(1995));
        System.out.println(sumDigits(99));

    }

    private static int sumDigits(int number) {

        int sum = 0;

        if (number >= 10 || (number < 0)) {
            while (number > 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }
            return sum;
        }
        return -1;
    }

}
