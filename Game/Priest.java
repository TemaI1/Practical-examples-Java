package Game;

import java.util.List;

public class Priest extends Npc {
    public Priest(List<Npc> team, String name) {
        super(12, 7, 0, new int[]{-4,-4}, 30, 5, true, name);
    }
}
