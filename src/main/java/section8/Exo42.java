package section8;

import java.util.Arrays;
import java.util.Scanner;

public class Exo42 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int count = readInteger();
        int[] array = readElements(count);
        System.out.println(Arrays.toString(array));
        System.out.println(findMin(array));

    }

    private static int findMin(int[] array) {

        boolean flag = true;

        while(flag){
            flag = false;
            for(int i = 0; i < array.length -1 ; i++){
                if (array[i] > array[i+1]){
                    int stock = array[i];
                    array[i] = array[i+1];
                    array[i+1] = stock;
                    flag = true;
                }
            }
        }

        return array[0];
    }


    private static int readInteger() {
        System.out.println("Choose a number : ");
        int count = scanner.nextInt();
        return count;
    }

    private static int[] readElements(int count) {

        int[] array = new int[count];

        for(int i = 0; i < count; i++){
            System.out.println("entrer le nombre : " + (i+1) );
            array[i] = scanner.nextInt();
        }
        return array;
    }








}
