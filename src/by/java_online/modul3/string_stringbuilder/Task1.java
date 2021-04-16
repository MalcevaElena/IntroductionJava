package by.java_online.modul3.string_stringbuilder;

// Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class Task1 {
    public static void main(String[] args) {
        int numberOfSpace;
        String string;

        string = "Три  девицы под окном Пряли   поздно    вечерком." +
                "Кабы  я была    царица, Говорит  одна        девица," +
                "То  на   весь  крещеный   мир Приготовила  б   я    пир».";

        numberOfSpace = space(string);

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
