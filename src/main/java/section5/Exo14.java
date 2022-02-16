package section5;

public class Exo14 {

    public static void main(String[] args) {

        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));


    }


    private static int sumOdd(int start, int end) {

        int sum = 0;

        if (end >= start && start > 0) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum = sum + i;
                }
            }
            return sum;
        }
        return -1;
    }

    private static boolean isOdd(int number) {

        if (number > 0) {
            if (number % 2 != 0) {
                return true;
            }
            return false;
        }
        return false;
    }


}
