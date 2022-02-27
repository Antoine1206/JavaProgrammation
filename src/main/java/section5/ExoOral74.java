package section5;

import java.util.Scanner;

public class ExoOral74 {

    public static void main(String[] args) {

        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number");
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Enter number " + i);
                int number = scanner.nextInt();
                sum = sum + number;
                System.out.println("your number is " + number + " Total sum is " + sum);

            }
        } else {
            System.out.println("Invalid Number");
        }
        scanner.nextLine();
        System.out.println(sum);
        scanner.close();
    }
}

