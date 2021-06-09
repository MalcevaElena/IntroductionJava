package by.java_online.modul4.simple_class_and_object.task7;

public class Point {
    private final double x;
    private final double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanceTo(Point point) {
        double temp = Math.pow(point.getX() - this.x, 2);
        temp += Math.pow(point.getY() - this.y, 2);
        return Math.sqrt(temp);
    }

    @Override
    public String toString() {
        return String.format("(%.2f; %.2f)", this.x, this.y);
    }
}