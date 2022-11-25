package Game;

import java.util.List;

public class Sniper extends Npc {
    public Sniper(List<Npc> team, String name) {
        super(12, 10, 32, new int[]{8,10}, 15, 9, false, name);
    }
}
