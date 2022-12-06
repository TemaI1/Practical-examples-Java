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

    private Npc findAim(List<Npc> team) {
        float minDistance = Float.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).getState() == States.DEAD) continue;
            float distance = getPosition().getDist(team.get(i).getPosition());
            if (minDistance > distance) {
                minDistance = distance;
                index = i;
            }
        }
        return team.get(index);
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
        if (shoot <= 0) return;
        shoot--;
        Npc aim = findAim(team);
        getAttack(aim);
    }
}
