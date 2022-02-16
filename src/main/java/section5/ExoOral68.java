package section5;

public class ExoOral68 {


    public static void main(String[] args) {


        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            count++;
            System.out.println("Even number" + number + " " + count);
            if (count == 5){
                System.out.println("SORTIE" + count);
                break;
            }
        }


    }

    private static boolean isEvenNumber(int number) {

        if (number % 2 == 0){
            return true;
        }
        return false;
    }


}
