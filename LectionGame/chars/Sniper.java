package chars;

import java.util.List;

public class Sniper extends Npc {
    int shoot;
    public Sniper(List<Npc> team, int x, int y) {
        super(12, 10, 32, new int[]{8,10}, 15, 9, false, false, "Sniper");
        super.team = team;
        super.position = new Vector2(x, y);
        this.shoot = shoot;
    }
    @Override
    public void step(List<Npc> team) {
        if (getState() == States.DEAD) return;
        for (int i=0; i <getTeam().size(); i++) {
            if (getTeam().get(i).getClass().getSimpleName().equals("Peasant") &&
                getTeam().get(i).getState().equals(States.ALIVE)) {
                shoot++;
                getTeam().get(i).setState(States.USED);
            }
        }
    }
}
