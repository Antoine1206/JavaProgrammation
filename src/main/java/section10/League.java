package section10;

import java.util.ArrayList;
import java.util.Collections;


//Generic Class League : T => accepte un type générique qui vient de la classe Team
public class League<T extends Team> {

    private String name;
    private ArrayList<T> sportLeague = new ArrayList<>();   //Liste générique T


    public boolean addTeam(T team) {
        if (sportLeague.contains(team)) {
            System.out.println("L'équipe existe déja");
            return false;
        } else {
            sportLeague.add(team);
            System.out.println("Equipe ajouté !");
            return true;
        }
    }

    public void showLeagueTable(){   //
        Collections.sort(sportLeague);
        for (T t: sportLeague ) {
            System.out.println(t.getName() + ": " +t.ranking());
        }
    }


    public League(String name) {
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
        return "League{" +
                "name='" + name + '\'' +
                ", sportLeague=" + sportLeague +
                '}';
    }
}
