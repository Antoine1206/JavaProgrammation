package section5;

public class Exo24 {

    public static void main(String[] args) {


        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));


    }

    private static boolean canPack(int bigCount, int smallCount, int goal) {

        int kgFarineBigCount = bigCount * 5;
        int kgFarineSmallCount = smallCount;
        int GoalSum = kgFarineBigCount + kgFarineSmallCount;


        if (bigCount >= 0 || smallCount >= 0) {
            if (GoalSum >= goal) {

                if (kgFarineBigCount > goal) {
                    return false;
                }
                return true;
            }
            return false;

        }
        return false;

    }


}
