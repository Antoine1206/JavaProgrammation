package section8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ExoOral103 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = readIntergers(3);
        System.out.println(array);
        System.out.println(Arrays.toString(array));

        System.out.println(findMin(array));

    }

    private static int findMin(int[] array) {

        for (int i = 0; i < array.length -1; i++){
            if (array[i] > array[i + 1]){
                int stock = array[i];
                array[i] = array[i + 1];
                array[i + 1] = stock;
            }
        }
        return array[0];
    }

    private static int[] readIntergers(int count) {

        int[] array = new int[count];

        for(int i = 0; i < count; i++){
            System.out.println("Enter your number " + i + " : ");
            array[i] = scanner.nextInt();
        }
        return array;
    }





}
