package Chapter4.two;

import java.util.ArrayList;

/**
 * Created by ivnytska on 2/2/2016.
 */
public class Wheel {
    private final int radius;
    private boolean condition;

    public Wheel(int radius, boolean condition) {
        this.radius = radius;
        this.condition = condition;
    }

    public int getRadius() {
        return radius;
    }

    public boolean getCondition () {
        return condition;
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Wheel radius: ").append(radius);
//        sb.append("Wheel is ok: ").append(condition);
//        return sb.toString();
//    }
}