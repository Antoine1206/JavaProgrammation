package section4;

public class ExoOral60 {

    public static void main(String[] args) {

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));

    }

    private static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59){
            int XX = minutes / 60;
            int YY = minutes % 60;
            int ZZ = seconds;

            return XX + "h" + YY + "m" + ZZ + "s";
        }
        return "invalid value";
    }

    private static String getDurationString(int seconds) {
        if (seconds >= 0){
            int howManyMinutes = seconds / 60;
            int howManySecondsLeft = seconds % 60;
            return getDurationString(howManyMinutes, howManySecondsLeft);
        }
        return "invalid value";
    }
}
