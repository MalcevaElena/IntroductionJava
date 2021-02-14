package by.java_online.modul1.linear_programs;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения).

public class Task3 {
    public static void main(String[] args) {
        double x = 50; //значения в градусах
        double y = 50;
        double radiansX = Math.toRadians(x); // значения в радианах
        double radiansY = Math.toRadians(y);

        double result = (Math.sin(radiansX)+ Math.cos(radiansY))/
                (Math.sin(radiansY)-Math.cos(radiansX))*Math.tan(radiansX*radiansY);
        System.out.format("Значение выражения равено:" + result);
    }
}
