package section8;

import java.util.Arrays;

public class ExoOral104 {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};

        reverse(array);

    }

    private static void reverse(int[] array) {

        int i, k, temp;
        for (i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("Reversed Array: \n" + Arrays.toString(array));
    }


}
