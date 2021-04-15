package by.java_online.modul3.string_array;

/* Удалить в строке все лишние пробелы,
 * то есть серии подряд идущих пробелов заменить на одиночные пробелы.
 * Крайние пробелы в строке удалить.
 */

public class Task5 {
    public static void main(String[] args) {
        String string = " Good  Morning! ";
        System.out.println(string.trim().replaceAll("\\s+", " "));
    }
}
