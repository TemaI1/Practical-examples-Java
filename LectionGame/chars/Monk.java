package chars;

import java.util.List;

public class Monk extends Npc {
    public Monk(List<Npc> team, int x, int y) {
        super(12, 7, 0, new int[]{-4,-4}, 30, 5, false, true, "Monk");
        super.team = team;
        super.position = new Vector2(x, y);
    }

}
