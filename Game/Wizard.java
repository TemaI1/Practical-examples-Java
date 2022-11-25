package Game;

import java.util.List;

public class Wizard extends Npc {
    public Wizard(List<Npc> team, String name) {
        super(17, 12, 0, new int[]{-5,-5}, 30, 9, true, name);
        super.team = team;
    }

    @Override
    public void step() {
        // лечение 
        
    }
}
