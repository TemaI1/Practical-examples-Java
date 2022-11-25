package Game;

import java.util.List;

public class Robber  extends Npc {
    public Robber (List<Npc> team, String name) {
        super(8, 3, 0, new int[]{2,4}, 10, 6, false, name);
    }
}
