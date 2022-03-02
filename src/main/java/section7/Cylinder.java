package section7;

public class Cylinder extends Circle {


    private double height;



    public double getVolume(){
       return super.getArea() * height;
    }


    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0){
            height = 0;
        }
        this.height = height;
    }
}
