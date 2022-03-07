package section7;

public class Circle {

    private double radius;


    public double getArea(){
        return radius * radius * Math.PI;
    }


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0){
            radius = 0;
        }
        this.radius = radius;
    }
}
