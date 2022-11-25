package Game;

import java.util.List;

public abstract class Npc implements BaseInterface{
    int atac;
    int defence;
    int shots;
    int[] damage;
    int health;
    int speed;
    // int delivery;
    Boolean magic;
    String name;
    protected int maxHealth;
    protected List<Npc> team;

    public Npc(int atac, int defence, int shots, int[] damage, int health, int speed, Boolean magic, String name){
        this.atac = atac;
        this.defence = defence;
        this.shots = shots;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.magic = magic;
        this.name = name;
        this.maxHealth = health;
    }

    @Override 
    public String toString() {
        return name + ", atac: " + atac + ", defence: " + defence + ", shots: " + shots + ", damage: " + damage[0] + "-" + damage[1] + ", health: " + health + ", speed: " + speed + ", magic: " + magic;
    }

    @Override
    public void step() {
        
    }

    @Override
    public String getInfo() {
        return null;
    }

}



