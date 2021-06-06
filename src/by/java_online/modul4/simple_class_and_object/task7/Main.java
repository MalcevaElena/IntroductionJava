package by.java_online.modul4.simple_class_and_object.task7;

/* Описать класс, представляющий треугольник.
 * Предусмотреть методы для создания объектов, вычисления
  площади, периметра и точки пересечения медиан.
 */
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle
                (new Point(1, 1), new Point(2, 4), new Point(3, 2));
        System.out.printf("Периметр треугольника = %.2f \n", TriangleLogic.getPerimeter(triangle));
        System.out.printf("Площадь треугольника = %.2f \n", TriangleLogic.getArea(triangle));
        System.out.println("Точка пересечения медиан " + TriangleLogic.medianIntersectionPoint(triangle));
    }
}
