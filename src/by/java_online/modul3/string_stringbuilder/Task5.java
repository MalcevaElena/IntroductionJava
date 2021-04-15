package by.java_online.modul3.string_stringbuilder;

// Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class Task5 {
    public static void main(String[] args) {
        String string = "Во саду ли, в огороде. Девица гуляла, Она ростом невеличка, Собой круглоличка.";
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'а') {
                count++;
            }
        }
        System.out.println("Дана строка:\n" + string);
        System.out.println("Буква 'а' встречается " + count + " раз(а).");
    }
}
