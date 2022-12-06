package chars;

import java.util.Arrays;
import java.util.List;

public abstract class Npc implements BaseInterface {
    private int attack;
    private int defence;
    private int shoot;
    private int[] damage;
    protected double health;
	protected int maxHealth;
    private int speed;
    private boolean delivery;
    private boolean magic;
    private String name;
	private States state;
    protected List<Npc> team;
    protected Vector2 position;
    private int protection;

    public Npc(int attack, int defence, int shoot, int[] damage, double health, int speed, boolean delivery, boolean magic, String name) {
        this.attack = attack;
        this.defence = defence;
        this.shoot = shoot;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.delivery = delivery;
        this.magic = magic;
        this.name = name;
    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        if (health > getMaxHealth()) this.health = maxHealth;
        else this.health = health;
    }

    public double getMaxHealth() {
        return maxHealth;
    }

    public String getName() {
        return name;
    }

    public List<Npc>getTeam() {
        return team;
    }

    public States getState() {
        return state;
    }

    public void setState(States state) {
        this.state = state;
    }

    public int[] getDamage() {
        return damage;
    }

    protected void getAttack(Npc hero) {
        if (attack == hero.protection && speed < position.getDist(hero.getPosition())) hero.health -=(damage[0]+damage[1])/4;
        if (attack == hero.protection) hero.health -= (damage[0]+damage[1])/2;
        if (attack > hero.protection && speed < position.getDist(hero.getPosition())) hero.health -= damage[1]/2;
        if (attack > hero.protection) hero.health -= damage[1];
        if (attack < hero.protection && speed < position.getDist(hero.getPosition())) hero.health -= damage[0]/2;
        else  hero.health -= damage[0];
        if (hero.health <= 0) {
            hero.health = 0;
            hero.setState(States.DEAD);
        }
    }

    @Override
    public String getInfo() {
        return "attack=" + attack +
                ", protection=" + defence +
                ", shoot=" + shoot +
                ", damage=" + Arrays.toString(damage) +
                ", health=" + health +
                ", speed=" + speed +
                ", delivery=" + delivery +
                ", magic=" + magic;
    }

    @Override
    public void step(List<Npc> team) {

    }
}
