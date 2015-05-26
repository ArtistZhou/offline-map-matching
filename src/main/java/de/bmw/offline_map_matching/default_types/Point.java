package de.bmw.offline_map_matching.default_types;

/**
 * Represents a spatial point.
 */
public class Point {

    final public double x;
    final public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
}
