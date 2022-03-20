package section11;

public class Main {


    public static void main(String[] args) {

        Series series = new Series("serie1");
        series.nSum(1);
        series.nSum(4);
        series.nSum(5);
        series.nSum(10);

        series.factorial(1);
        series.factorial(2);
        series.factorial(7);
        series.factorial(3);

        System.out.println(series);


        System.out.println("\nFibonacci = ");
        for (int i = 0; i <= 10; i++){
            System.out.println(Series.fiboo(i));
        }


    }

}
