package chars;

import java.util.List;

public class Sniper extends Npc {
    public Sniper(List<Npc> team, int x, int y) {
        super(12, 10, 32, new int[]{8,10}, 15, 9, false, false, "Sniper");
        super.team = team;
        super.position = new Vector2(x, y);
    }
}
