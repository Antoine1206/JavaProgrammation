package section8;

import java.util.Arrays;
import java.util.Scanner;

public class Exo41 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = getIntegers(4);

        int[] sortedArray = sortIntegers(array);

        printArray(sortedArray);


    }

    private static void printArray(int[] sortedArray) {
        for(int i=0; i<sortedArray.length; i++) {
            System.out.println("Element " + i + " contents " + sortedArray[i]);
        }
    }

    private static int[] sortIntegers(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }


        return sortedArray;

    }

    private static int[] getIntegers(int taille) {

        int[] tableau = new int[taille];
        System.out.println("entrer des nombres");
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = scanner.nextInt();
        }

        return tableau;
    }


}
