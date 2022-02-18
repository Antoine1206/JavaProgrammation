package section5;

public class Exo15ARefaire {

    public static void main(String[] args) {

        int[] nombres = {0, 2, 113, 11, 1443, 1441, 1654, 19891};

        for (int nombre : nombres) {
            System.out.println(nombre + " est un palindrome? "
                    + estPalindrome(nombre));
        }
    }

    private static boolean estPalindrome(int nombre) {
        if (nombre == inverse(nombre)) {
            return true;
        }
        return false;
    }

    private static int inverse(int nombre) {
        int inverse = 0;
        while (nombre != 0) {
            inverse = inverse * 10 + nombre % 10;
            nombre = nombre / 10;
        }
        return inverse;
    }

}