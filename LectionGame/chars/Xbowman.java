package chars;

import java.util.List;

public class Xbowman extends Npc {
    public Xbowman(List<Npc> team, int x, int y) {
        super(6, 3, 16, new int[]{2,3}, 10, 4, false, false, "Xbowman");
        super.team = team;
        super.position = new Vector2(x, y);
    }
}
