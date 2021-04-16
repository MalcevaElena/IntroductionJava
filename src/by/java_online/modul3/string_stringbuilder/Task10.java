package by.java_online.modul3.string_stringbuilder;

/* Строка X состоит из нескольких предложений, каждое из которых кончается
 * точкой, восклицательным или вопросительным знаком.
 * Определить количество предложений в строке X.
 */

public class Task10 {
    public static void main(String[] args) {
        int numberLine;
        String string;

        string = "Строка X. Состоит из нескольких предложений! Каждое из которых кончается точкой,." +
                " восклицательным! или вопросительным знаком? Определить. количество предложений? в строке X.";
        numberLine = numberOfLine(string);

        System.out.println("Количество предложений в строке Х = " + numberLine);
    }

    public static int numberOfLine(String str) {
        int count = 0;
        char[] charArray = {'.', '?', '!'};

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = 0; j < charArray.length; j++) {
                if (ch == charArray[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
