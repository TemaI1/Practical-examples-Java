package chars;

import java.util.List;

public class Spearman extends Npc {
    public Spearman(List<Npc> team, int x, int y) {
        super(4, 5, 0, new int[]{1,3}, 10, 4, false, false, "Spearman");
        super.team = team;
        super.position = new Vector2(x, y);
    }
}
