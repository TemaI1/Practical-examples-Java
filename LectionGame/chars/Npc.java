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
	
    public double getHealth() {
        return health;
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

    public double getMaxHealth() {
        return maxHealth;
    }

    public int[] getDamage() {
        return damage;
    }

    public void setHealth(double health) {
        if (health > getMaxHealth()) this.health = maxHealth;
        else this.health = health;
    }

    public void setState(States state) {
        this.state = state;
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
