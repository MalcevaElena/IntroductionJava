package by.java_online.modul2.decomposition;

/*
 * Вычислить площадь правильного шестиугольника со стороной а,
 * используя метод вычисления площади треугольника.
 */
public class Task03 {
    public static void main(String[] args) {
        double a = 5;
        double s;

        s = Math.pow(a, 2) * Math.sqrt(3) / 4 * 6;

        System.out.printf("Площадь правильного шестиугольника со стороной а="+a+" равна: %.2f",s);
    }
}
