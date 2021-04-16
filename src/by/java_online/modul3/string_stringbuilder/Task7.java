package by.java_online.modul3.string_stringbuilder;
/* Вводится строка.
 * Требуется удалить из нее повторяющиеся символы и все пробелы.
 * Например, если было введено "abc cde def", то должно быть выведено "abcdef".
 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        String string = enterToConsole();
        deleteChar(string);

    }

    public static String enterToConsole() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите с повторяющимися символами и пробелами.");
        String str = sc.nextLine();

        return str;
    }

    public static void deleteChar(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);

        for (int i = 0; i < stringBuilder.length(); i++) {
            char chi = stringBuilder.charAt(i);

            if (chi == ' ') {
                stringBuilder.deleteCharAt(i);
                i--;
                continue;
            }
            for (int j = i + 1; j < stringBuilder.length(); j++) {
                char chj = stringBuilder.charAt(j);
                if (chj == chi) {
                    stringBuilder.deleteCharAt(j);
                }
            }
        }
        System.out.println(stringBuilder);
    }
}
