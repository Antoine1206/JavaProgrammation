package section9;

import java.util.ArrayList;
import java.util.List;

public class Joueur implements ISaveable {


    private String name;
    private String weapon;

    private int hitPoints;
    private int strength;


    public Joueur(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = ("sword");
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String>  listeString = new ArrayList<>();
        listeString.add(0, name);
        listeString.add(1, weapon);
        listeString.add(2, "" + hitPoints);
        listeString.add(3, "" + strength);
        return listeString;
    }

    @Override
    public void read(List<String> savedValues) {

        List<String> listeValeursStock = new ArrayList<>();
        if (savedValues != null && savedValues.size() > 0){
            name = listeValeursStock.get(0);
            weapon = listeValeursStock.get(1);
            hitPoints = Integer.parseInt(savedValues.get(2));
            strength = Integer.parseInt(savedValues.get(3));
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

}
