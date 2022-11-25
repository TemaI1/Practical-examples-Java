package Game;

import java.util.List;

public class Crossbowman extends Npc {
    public Crossbowman(List<Npc> team, String name) {
        super(6, 3, 16, new int[]{2,3}, 10, 4, false, name);
    }
}
