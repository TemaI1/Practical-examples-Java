package chars;

import java.util.List;

public class Peasant extends Npc {


    public Peasant(List<Npc> team, int x, int y) {
        super(1, 1, 0, new int[]{1,1}, 1, 3, true, false, "Peasant");
        super.team = team;
        super.position = new Vector2(x, y);
    }
}
