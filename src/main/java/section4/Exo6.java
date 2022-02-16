package section4;


public class Exo6 {

    public static void main(String[] args) {

        System.out.println(hasEqualSome(1,2,3));
        System.out.println(hasEqualSome(1,2,4));
    }

    public static boolean hasEqualSome(int param1, int param2, int param3){

        if(param1 + param2 == param3){
            return true;
        }
        return false;
    }

}
