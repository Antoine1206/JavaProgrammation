package section4;

public class Exo7 {

    public static void main(String[] args) {

        System.out.println(hasTeen(12,58,15));
        System.out.println(hasTeen(14,16,15));
        System.out.println(hasTeen(2,80,90));

    }

    public static boolean hasTeen(int param1, int param2, int param3){
        if((param1 <= 19 && param1 >= 13) || (param2 <= 19 && param2 >= 13) || (param3 <= 19 && param3 >= 13)){
            return true;
        }
        return false;
    }

}
