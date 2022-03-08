package section8;

import java.util.Arrays;

public class Exo43 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        reverse(array);

    }

    private static void reverse(int[] array) {

        System.out.println(Arrays.toString(array));

        for (int i = 0; i <= (array.length) / 2; i++) {
            int stock = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = stock;
        }
        System.out.println(Arrays.toString(array));

    }

}
