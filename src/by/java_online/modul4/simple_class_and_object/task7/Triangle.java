package by.java_online.modul4.simple_class_and_object.task7;

public class Triangle {
    private final Point a;
    private final Point b;
    private final Point c;

    Triangle(Point a, Point b, Point c) {
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

    private void checkPointsTriangle(Point a, Point b, Point c) {
        if (a == null || b == null || c == null) {
            System.out.println("Point not may be null.");
            throw new RuntimeException();
        }
        double sideA = a.distanceTo(b);
        double sideB = b.distanceTo(c);
        double sideC = a.distanceTo(c);

        if (sideA * sideB * sideC == 0 || sideA + sideB <= sideC || sideA + sideC <= sideB) {
            System.out.println("Incorrect triangle points.");
            throw new RuntimeException();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (a != null ? !a.equals(triangle.a) : triangle.a != null) return false;
        if (b != null ? !b.equals(triangle.b) : triangle.b != null) return false;
        return c != null ? c.equals(triangle.c) : triangle.c == null;
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
