package by.java_online.modul4.simple_class_and_object.task7;

import java.io.Serializable;
import java.util.Objects;

public class Triangle implements Serializable {
    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle() throws RuntimeException {
        this.a = new Point(1, 1);
        this.b = new Point(2, 2);
        this.c = new Point(5, 5);
        checkPointsTriangle(a, b, c);
    }

    public Triangle(Point a, Point b, Point c) throws RuntimeException{
        checkPointsTriangle(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    private void checkPointsTriangle(Point a, Point b, Point c) throws RuntimeException {
        if (a == null || b == null || c == null) {
            throw new RuntimeException("Point not may be null.");
        }
        double sideA = a.distanceTo(b);
        double sideB = b.distanceTo(c);
        double sideC = a.distanceTo(c);

        if (sideA * sideB * sideC == 0 || sideA + sideB <= sideC || sideA + sideC <= sideB) {
            throw new RuntimeException("Incorrect triangle points.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (!Objects.equals(a, triangle.a)) return false;
        if (!Objects.equals(b, triangle.b)) return false;
        return Objects.equals(c, triangle.c);
    }

    @Override
    public int hashCode() {
        int result = a != null ? a.hashCode() : 0;
        result = 31 * result + (b != null ? b.hashCode() : 0);
        result = 31 * result + (c != null ? c.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
