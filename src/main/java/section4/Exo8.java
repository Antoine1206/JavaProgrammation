package section4;

public class Exo8 {

    public static void main(String[] args) {

        System.out.println(area(5.0));
        System.out.println(area(-1.0, 4.0));

    }

    private static double area(double radius) {
        if (radius > 0){
            double areaCircle = radius * radius * Math.PI;
            return areaCircle;
        }
        return -1.0;
    }

    private static double area(double x, double y) {
        if (x > 0 && y > 0){
            double areaRectangle = x * y;
            return areaRectangle;
        }
        return -1.0;
    }
}
