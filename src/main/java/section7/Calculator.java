package section7;

public class Calculator {


    private Floor floor;
    private Carpet carpet;


    public double getTotalCost() {
        double sumFloorCarpet = (floor.getArea() * carpet.getCost());
        return sumFloorCarpet;
    }


    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }


    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public void setCarpet(Carpet carpet) {
        this.carpet = carpet;
    }
}
