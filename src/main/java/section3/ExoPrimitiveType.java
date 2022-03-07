package section3;

public class ExoPrimitiveType {

    public static void main(String[] args) {

        /**
         * Intervalle de Valeur Byte
         */
        byte variabelMaxByte = Byte.MAX_VALUE;
        int variabelMinByte = Byte.MIN_VALUE;
        System.out.println(variabelMaxByte);
        System.out.println(variabelMinByte);

        /**
         * Intervalle de Valeur Short
         */
        short variabelMaxShort = Short.MAX_VALUE;
        short variabelMinShort = Short.MIN_VALUE;
        System.out.println(variabelMaxShort);
        System.out.println(variabelMinShort);

        /**
         * Intervalle de Valeur Int
         */
        int variabelMaxInt = Integer.MAX_VALUE;
        int variabelMinInt = Integer.MIN_VALUE;
        System.out.println(variabelMaxInt);
        System.out.println(variabelMinInt);


        /**
         * Intervalle de Valeur Long
         */
        long variabelMaxLong = Long.MAX_VALUE;
        long variabelMinLong = Long.MIN_VALUE;
        System.out.println(variabelMaxLong);
        System.out.println(variabelMinLong);

        /**
         * Intervalle de Valeur Float
         */
        float variabelMaxFloat = Float.MAX_VALUE;
        float variabelMinFloat = Float.MIN_VALUE;
        System.out.println(variabelMaxFloat);
        System.out.println(variabelMinFloat);

        /**
         * Intervalle de Valeur Double
         */
        double variabelMaxDouble = Double.MAX_VALUE;
        double variabelMinDouble = Double.MIN_VALUE;
        System.out.println(variabelMaxDouble);
        System.out.println(variabelMinDouble);


        int variablePound = 200;
        double variableCalcul = variablePound * 0.45359237;
        System.out.println(variableCalcul);

        char mychar = 'd';
        System.out.println(mychar);

        char myUnicode = '\u00A9';
        System.out.println(myUnicode);


        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("it's not an alien");
        }

        if (isAlien != true) {
            System.out.println("it's still not an alien");
        }

        int topScore = 100;
        if (topScore > 100) {
            System.out.println("pas supérieur à 100");
        } else {
            System.out.println(" supérieur à 100");
        }

        int lowScore = 50;
        if (lowScore > 40 && lowScore < 100) {    //&& => AND
            System.out.println("Score moyen obtenu");
        }

        int score = 50;
        if (score > 60 || score < 100) {    //|| => OU
            System.out.println("score respectant une seule condition");
        }
        boolean isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasar is true");
        }


        double variable1 = 20.00d;
        double variable2 = 80.00d;
        double variable3 = variable1 + variable2 * 100.00d;
        System.out.println(variable3);
        double variable4 = variable3 % 40.00d;
        System.out.println(variable4);


        boolean variable5 = (variable4 == 0) ? true : false;
        System.out.println(variable5);
        if (!variable5) {
            System.out.println("got some remainders");
        }


    }

}
