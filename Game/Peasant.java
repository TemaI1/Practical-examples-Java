package Game;

import java.util.List;

public class Peasant extends Npc {
    public Peasant(List<Npc> team, String name) {
        super(1, 1, 0, new int[]{1,1}, 1, 3, false, name);
    }
}
