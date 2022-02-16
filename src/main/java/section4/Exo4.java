package section4;

public class Exo4 {

    public static void main(String[] args) {

        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));
        System.out.println(toMilesPerHour(10.5));


        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);

        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));


        System.out.println("espace entre les exos");

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));


    }

    //Exo 4
    private static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    //Exo 1
    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        } else {
            double milesPerHour = kilometersPerHour / 1.609;
            long milesPerHourArrondie = Math.round(milesPerHour);
            return milesPerHourArrondie;
        }
    }

    // Exo 2
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int variable1 = kiloBytes / 1024;
            int variable2 = kiloBytes % 1024;

            System.out.println(kiloBytes + "KB = " + variable1 + " MB and " + variable2 + "KB");
        }
    }

    //Exo3
    private static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking == false) {
            return false;
        } else if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (hourOfDay < 8 || hourOfDay > 22) {
            return true;
        } else {
            return false;
        }
    }

}