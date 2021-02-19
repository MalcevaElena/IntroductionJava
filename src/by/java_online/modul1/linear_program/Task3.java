package by.java_online.modul1.linear_program;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения).

public class Task3 {
    public static void main(String[] args) {
        double x;
        double y;
        double radiansX;
        double radiansY;

        x = 50; //значения в градусах
        y = 50;
        radiansX = Math.toRadians(x); // значения в радианах
        radiansY = Math.toRadians(y);

        double result;

        result = (Math.sin(radiansX) + Math.cos(radiansY)) /
                (Math.sin(radiansY) - Math.cos(radiansX)) * Math.tan(radiansX * radiansY);

        System.out.format("Значение выражения равено:" + result);
    }
}
