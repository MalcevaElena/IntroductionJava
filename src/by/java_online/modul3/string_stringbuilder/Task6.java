package by.java_online.modul3.string_stringbuilder;

// Из заданной строки получить новую, повторив каждый символ дважды.

public class Task6 {
    public static void main(String[] args) {
        String string = "Во саду ли, в огороде. Девица гуляла.";
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < 2; j++) {
                stringBuilder.append(string.charAt(i));
            }
        }
        System.out.println(stringBuilder);
    }
}
