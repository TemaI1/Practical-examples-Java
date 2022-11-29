package chars;

import java.util.List;

public class Wizard extends Npc {
    public Wizard(List<Npc> team, int x, int y) {
        super(17, 12, 0, new int[]{-5,-5}, 30, 9, false, true, "Wizard");
        super.team = team;
        super.position = new Vector2(x, y);
    }
}
