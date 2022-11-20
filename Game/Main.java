package Game;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List gang = List.of(new Peasant("Artur"), 
                            new Wizard("Misha"), 
                            new Sniper("Nikita"),
                            new Robber("Stas"),
                            new Priest("Artem"),
                            new Lancer("Vova"),
                            new Crossbowman("Axel"));

        for (int i = 0; i < gang.size(); i++) {
            System.out.println(gang.get(i));
        }

    }
}

