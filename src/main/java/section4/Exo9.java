package section4;

public class Exo9 {

    public static void main(String[] args) {

        printYearsAndDays(1260000L);
        printYearsAndDays(525600L);
        printYearsAndDays(1051200L);
        printYearsAndDays(561600L);

    }


    public static void printYearsAndDays(Long minutes){
        if (minutes < 0){
            System.out.println("Invalid value");
        }

        Long XX = minutes;
        Long YY = minutes / (60 * 24 * 365);
        Long ZZ = (minutes / (60 * 24)) % 365;

        System.out.println(XX + " min = " + YY + " y and " + ZZ + " d" );
    }

}
