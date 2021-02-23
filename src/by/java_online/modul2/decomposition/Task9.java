package by.java_online.modul2.decomposition;

/* Даны числа X, Y, Z, Т — длины сторон четырехугольника.
 * Написать метод(методы) вычисления его площади,
 * если угол между сторонами длиной X и Y— прямой.
 */

public class Task9 {
    public static void main(String[] args) {
        double x = 5;
        double y = 9;
        double z = 12;
        double t = 7;
        double hypotenuse;
        double areaQuadrangle;

        System.out.println("Даны числа X = " + x + ", Y = " + y + ", Z = " + z + ", Т = " + t + " — " +
                "длины сторон четырехугольника. Угол между сторонами X и Y— прямой.");

        hypotenuse = hypotenuse(x, y);
        areaQuadrangle = areaTriangle(x, y, hypotenuse) + areaTriangle(z, t, hypotenuse);

        System.out.printf("Площадь четырехугольника равна %.2f", areaQuadrangle);

    }

    public static double hypotenuse(double i, double j) { //по теореме Пифагора
        return Math.sqrt(Math.pow(i, 2) + Math.pow(j, 2));
    }

    public static double areaTriangle(double i, double j, double hypotenuseIJ) { //по формуле Герона
        double p;
        double s;

        p = (i + j + hypotenuseIJ) / 2;
        s = Math.sqrt(p * (p - i) * (p - j) * (p - hypotenuseIJ));

        return s;
    }
}
