package section9;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {


    private String name;
    private int hitPoints;
    private int Strength;


    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        Strength = strength;
    }


    @Override
    public List<String> write() {
        List<String> listeStock = new ArrayList<>();
        listeStock.add(name);
        listeStock.add(String.valueOf(hitPoints));
        listeStock.add(String.valueOf(Strength));
        return listeStock;
    }

    @Override
    public void read(List<String> savedValues) {
        List<String> listeStock = new ArrayList<>();
        name = listeStock.get(0);
        hitPoints = Integer.parseInt(listeStock.get(1));
        Strength = Integer.parseInt(listeStock.get(2));
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return Strength;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }


    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", Strength=" + Strength +
                '}';
    }
}
