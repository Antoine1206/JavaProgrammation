package section5;

public class Exo16 {


    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(30));
        System.out.println(sumFirstAndLastDigit(151));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
    }

    private static int sumFirstAndLastDigit(int number) {

        int reversedNum = 0;
        int lastDigit = number % 10;

        if (number > 0) {
            while (number > 10) {
                int autreTruc = number % 10;
                reversedNum = reversedNum * 10 + autreTruc;
                number /= 10;
            }
            int sum = number + lastDigit;
            return sum;
        }
        return -1;
    }
}
