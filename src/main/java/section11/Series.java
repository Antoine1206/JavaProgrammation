package section11;

public class Series {

    private String name;
    int sum = 0;
    int product = 1;


    public long nSum(int n) {
        sum += n;
        return sum;
    }

    public long factorial(int u) {
        product *= u;
        return product;
    }

    public static long fiboo(int y) {
        if (y == 0){
            return y;
        } else if (y == 1){
            return y;
        }
        return fiboo(y - 1) + fiboo(y - 2);
    }


    public Series(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Series{" +
                "name='" + name + '\'' +
                ", sum=" + sum +
                ", product=" + product +
                '}';
    }
}
