package chars;

import java.util.List;

public class Peasant extends Npc {


    public Peasant(List<Npc> team, int x, int y) {
        super(1, 1, 0, new int[]{1,1}, 1, 3, true, false, "Peasant");
        super.team = team;
        super.position = new Vector2(x, y);
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
        if (getState().equals(States.DEAD)) return;
        Npc aim =findAim(team);
        if (getPosition().getDist(aim.getPosition()) < Math.sqrt(2))
            getAttack(aim);
        int x = getPosition().x;
        int y = getPosition().y;
        if (aim.getPosition().y > y && checkPosition(new Vector2(x, y+1)) && (y+1 < 10))
            setPosition(new Vector2(x, y+1));
        if (aim.getPosition().y < y && checkPosition(new Vector2(x, y-1)) && (y-1 >= 0))
            setPosition(new Vector2(x, y-1));
        if (aim.getPosition().x > x && checkPosition(new Vector2(x+1, y)) && (x+1 < 10))
            setPosition(new Vector2(x+1, y));
        if (aim.getPosition().x > x && checkPosition(new Vector2(x-1, y)) && x-1 >= 0)
            setPosition(new Vector2(x-1, y));
    }

    private boolean checkPosition(Vector2 pos) {
        for (Npc base : getTeam()) {
            if (pos.isEqual(base.getPosition()))
                return false;
        }
        return true;
    }
}
