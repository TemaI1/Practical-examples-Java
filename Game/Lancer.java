package Game;

import java.util.List;

public class Lancer extends Npc {
    public Lancer(List<Npc> team, String name) {
        super(4, 5, 0, new int[]{1,3}, 10, 4, false, name);
    }
}
