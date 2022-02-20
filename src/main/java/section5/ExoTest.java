package section5;

import java.util.Scanner;

public class ExoTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");

        String name  = scanner.nextLine();
        System.out.println("Your name is " + name);

        System.out.println("enter your age");
        int age  = scanner.nextInt();
        System.out.println("Your age is " + age);

        scanner.close();

    }


}
