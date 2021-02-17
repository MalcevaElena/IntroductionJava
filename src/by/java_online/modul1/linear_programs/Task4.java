package by.java_online.modul1.linear_programs;

/* Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class Task4 {
    public static void main(String[] args) {
        double r = 321.877;
        int first = (int) r;
        int second = (int) ((r - first) * 1000);
        double result = second + first * 0.001;
        System.out.println("Число R вида nnn.ddd: " + r);
        System.out.println("Измененное число: " + result);
    }
}
