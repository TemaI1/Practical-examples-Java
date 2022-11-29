import chars.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int GANG_SIZE = 10;
    public static List<Npc> lightSide;
    public static List<Npc> darkSide;
    public static void main(String[] args) {
        init();

        Scanner scanner = new Scanner(System.in);

        while (true){
            ConsoleView.view();
            System.out.println("Press ENTER");
            scanner.nextLine();
        }
    }
    private static void init(){
        lightSide = new ArrayList<>();
        darkSide = new ArrayList<>();

        int x=1;
        int y=1;
        for (int i = 0; i < GANG_SIZE; i++) {
            switch (new Random().nextInt(4)){
                case 0: lightSide.add(new Peasant(lightSide, x++, y)); break;
                case 1: lightSide.add(new Robber(lightSide, x++, y)); break;
                case 2: lightSide.add(new Sniper(lightSide, x++, y)); break;
                default: lightSide.add(new Monk(lightSide, x++, y));
            }
        }

        x=1;
        y=10;
        for (int i = 0; i < GANG_SIZE; i++) {
            int randomNum = (int)(Math.random()*4);
            if (randomNum == 0) {
                darkSide.add(new Peasant(darkSide, x++, y));
            } else if (randomNum == 1) {
                darkSide.add(new Spearman(darkSide, x++, y));
            } else if (randomNum == 2) {
                darkSide.add(new Xbowman(darkSide, x++, y));
            } else {
                darkSide.add(new Wizard(darkSide, x++, y));
            }
        }
    }
}