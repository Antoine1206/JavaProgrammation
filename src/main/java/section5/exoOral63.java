package section5;

public class exoOral63 {


    public static void main(String[] args) {

        /**
         * A switch works with the byte, short, char, and int primitive data types.
         * It also works with enumerated types, the String class,
         * Character, Byte, Short, and Integer
         */

        char switchValue = 'C';

        switch (switchValue) {
            case 'A':
                System.out.println("A");
                break;

            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            case 'D':
                System.out.println("D");
                break;
            case 'E':
                System.out.println("E");
                break;
            default:
                System.out.println("Non trouvé");
                break;
        }

    }

}
