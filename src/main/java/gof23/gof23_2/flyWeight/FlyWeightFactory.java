package gof23.gof23_2.flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂，key-value结构
 */
public class FlyWeightFactory {
    private static Map<String, GoPiece> pool = new HashMap<>();

    public static GoPiece getGoPiece(String color) {
        if (!pool.containsKey(color)) {
            pool.put(color, new GoPiece(color));
        }
        return pool.get(color);
    }

    public static int getCount() {
        return pool.size();
    }
}
