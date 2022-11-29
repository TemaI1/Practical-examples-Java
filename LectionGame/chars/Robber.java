package chars;

import java.util.List;

public class Robber extends Npc{
    public Robber(List<Npc> team, int x, int y) {
        super(8, 3, 0, new int[]{2,4}, 10, 6, false, false, "Robber");
        super.team = team;
        super.position = new Vector2(x, y);
    }
}
