package section5;

public class ExoOral65 {

    public static void main(String[] args) {

        calculateInterest();


    }

    private static void calculateInterest() {

        for (int i = 0 ; i <= 10000; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        for(int i=2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;

    }


}
