package chars;

import java.util.List;

public class Wizard extends Npc {
    public Wizard(List<Npc> team, int x, int y) {
        super(17, 12, 0, new int[]{-5,-5}, 30, 9, false, true, "Wizard");
        super.team = team;
        super.position = new Vector2(x, y);
    }

    @Override
    public void step(List<Npc> team) {
        double minHp = Double.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < getTeam().size(); i++) {
            if (getState() != States.DEAD && getTeam().get(i).getMaxHealth() - getTeam().get(i).getHealth() != 0) {
                if (minHp > getTeam().get(i).getMaxHealth() - getTeam().get(i).getHealth()) {
                    minHp = getTeam().get(i).getMaxHealth() - getTeam().get(i).getHealth();
                    index = i;
                }
            }
        }
        if (minHp != Double.MAX_VALUE) {
            getTeam().get(index).setHealth(getHealth() - getDamage()[0]);
        }
    }
}
