package lesson3;

import java.util.ArrayList;

public class CLUB {
    public static void main(String[] args ){
        ArrayList< Player> team = new ArrayList<>() ;
        for (int i = 0; i < 4; i++) {
            team.add(new Player());
            System.out.println("Player added");
        }
        team.add(new Player("Brazil",21,"CDM"));
        Player Cafu = team.get(team.size()-1);
        Cafu.setPosition("CB");
        System.out.println(Cafu.getAge());
        System.out.println( Cafu.getAge()+" "+Cafu.getCountry()+" "+ Cafu.getPosition() );
        System.out.println(Cafu);

    }
}
