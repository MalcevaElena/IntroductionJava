package by.java_online.modul3.string_stringbuilder;
/* Вводится строка слов, разделенных пробелами.
 * Найти самое длинное слово и вывести его на экран.
 * Случай, когда самых длинных слов может быть несколько, не обрабатывать.
 */

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        String string;
        String longWord;

        string = enterToConsole("Введите строку слов, разделенных пробелами.");
        longWord = searchLongWord(string);

        System.out.println("Самое длинное слово: " + longWord);
    }

    public static String enterToConsole(String message) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println(message);

        return  sc.nextLine();
        }

    public static String searchLongWord(String str) {
        int max = 0;
        String searchLongWord = null;
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > max) {
                max = words[i].length();
                searchLongWord = words[i];
            }
        }
        return searchLongWord;
    }
}
