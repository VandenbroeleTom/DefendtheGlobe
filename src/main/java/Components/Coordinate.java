package Components;

import org.json.simple.JSONObject;

/**
 * Created by vande on 11/10/2017.
 */
public class Coordinate {

    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public JSONObject toJson() {
        JSONObject j = new JSONObject();
        j.put("x", x);
        j.put("y", y);
        return j;
    }
}
