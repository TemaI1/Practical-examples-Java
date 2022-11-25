package Game;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Npc> LightSide;
    public static List<Npc> DarkSide;

    public static void main(String[] args) {
        
        ArrayList<Npc> DarkSide = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randomNum = (int)(Math.random()*4);
            if (randomNum == 0) {
                DarkSide.add(new Peasant(DarkSide, "Peasant_" + i));
            } else if (randomNum == 1) {
                DarkSide.add(new Robber(DarkSide, "Robber_" + i));
            } else if (randomNum == 2) {
                DarkSide.add(new Sniper(DarkSide, "Sniper_" + i));
            } else {
                DarkSide.add(new Wizard(DarkSide, "Wizard_" + i));
            }
        }

        ArrayList<Npc> LightSide = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randomNum = (int)(Math.random()*4);
            if (randomNum == 0) {
                LightSide.add(new Crossbowman(LightSide, "Crossbowman_" + i));
            } else if (randomNum == 1) {
                LightSide.add(new Lancer(LightSide, "Lancer_" + i));
            } else if (randomNum == 2) {
                LightSide.add(new Peasant(LightSide, "Peasant_" + i));
            } else {
                LightSide.add(new Priest(LightSide, "Priest_" + i));
            }
        }

        // for (int i = 0; i < DarkSide.size(); i++) {
        //     System.out.println(DarkSide.get(i));
        // }

        // LightSide.forEach(System.out::println);

    }
}

