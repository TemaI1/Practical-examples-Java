package Game;

public abstract class Npc {
    int atac;
    int defence;
    int shots;
    int[] damage;
    int health;
    int speed;
    // int delivery;
    Boolean magic;
    String name;

    public Npc(int atac, int defence, int shots, int[] damage, int health, int speed, Boolean magic, String name){
        this.atac = atac;
        this.defence = defence;
        this.shots = shots;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.magic = magic;
    }

    @Override 
    public String toString() {
        return "atac: " + atac + ", defence: " + defence + ", shots: " + shots + ", damage: " + damage[0] + "-" + damage[1] + ", health: " + health + ", speed: " + speed + ", magic: " + magic;
    }

}



