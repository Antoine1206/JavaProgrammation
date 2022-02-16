package section5;

public class ExoOral64 {

    public static void main(String[] args) {

        printDayOfTheWeek(5);
        printDayOfTheWeek(36);


    }

    private static void printDayOfTheWeek(int day) {


        switch(day){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("wendday");
                break;
            case 4 :
                System.out.println("tuthrday");
                break;
            case 5 :
                System.out.println("Friday" );
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Invalid Type");
                break;
        }


    }


}
