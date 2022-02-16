package section4;

public class Exo1 {

    public static void main(String[] args) {


        int variable1 = calculateHighScorePosition(1500);
        displayHighScorePosition("Patrick", variable1);

        int variable2 = calculateHighScorePosition(900);
        displayHighScorePosition("Patrick", variable2);

        int variable3 = calculateHighScorePosition(400);
        displayHighScorePosition("Patrick", variable3);

        int variable4 = calculateHighScorePosition(50);
        displayHighScorePosition("Patrick", variable4);

    }

    public static int calculateHighScorePosition(int score) {
        if (score > 1000) {
            return 1;
        } else if (score > 500 && score < 1000) {
            return 2;
        } else if (score > 100 && score < 500) {
            return 3;
        }
        return 4;
    }

    private static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position");
        System.out.println(position + " on hight score table");
    }

}
