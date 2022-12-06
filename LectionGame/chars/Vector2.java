package chars;

public class Vector2 {
    public int x,y;

    public Vector2(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean isEqual(Vector2 pos){
        if (pos.y == y & pos.x ==x) return true;
        return false;
    }

    public float getDist(Vector2 position) {
        return (float) Math.sqrt((x - position.x) * (x - position.x)+(y-position.y)*(y-position.y));
    }
}
