package by.java_online.modul4.simple_class_and_object.task7;

public class TriangleLogic {

    public static double getSideAB(Triangle triangle) {
        return triangle.getA().distanceTo(triangle.getB());
    }

    public static double getSideBC(Triangle triangle) {
        return triangle.getB().distanceTo(triangle.getC());
    }

    public static double getSideAC(Triangle triangle) {
        return triangle.getB().distanceTo(triangle.getC());
    }

    public static double getPerimeter(Triangle t) {
        return getSideAB(t) + getSideAC(t) + getSideBC(t);
    }

    public static double getArea(Triangle t) {
        double p = getPerimeter(t) / 2.;
        return Math.sqrt(p * (p - getSideAB(t)) * (p - getSideBC(t)) * (p - getSideAC(t)));
    }

    public static Point medianIntersectionPoint(Triangle t) {
        Point point;
        double xABC = (t.getA().getX() + t.getB().getX() + t.getC().getX()) / 3;
        double yABC = (t.getA().getY() + t.getB().getY() + t.getC().getY()) / 3;
        point = new Point(xABC, yABC);
        return point;
    }
}
