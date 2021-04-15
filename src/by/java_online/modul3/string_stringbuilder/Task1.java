package by.java_online.modul3.string_stringbuilder;

// Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class Task1 {
    public static void main(String[] args) {
        String string = "Три  девицы под окном\n" +
                "Пряли   поздно    вечерком.\n" +
                "Кабы  я была    царица,\n" +
                "Говорит  одна        девица,\n" +
                "То  на   весь  крещеный   мир\n" +
                "Приготовила  б   я    пир».";

        int numberOfSpace = space(string);
        System.out.println("Наибольшее кол-во подряд идущих пробелов: " + numberOfSpace);
    }

    private static int space(String str) {
        int count = 0;
        int maxSpace = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isWhitespace(ch)) {
                count++;
            } else if (count > maxSpace) {
                maxSpace = count;
            } else {
                count = 0;
            }
        }

        return maxSpace;
    }
}
