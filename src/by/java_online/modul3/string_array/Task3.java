package by.java_online.modul3.string_array;

//В строке найти количество цифр.

public class Task3 {
    public static void main(String[] args) {
        String string = "654000, ул. Кирова 77, 234";
        int digits = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.toCharArray()[i];
            if (Character.isDigit(ch)) {
                digits++;
            }
        }
        System.out.println("Дана строка: " + string);
        System.out.println("Количество цифр в строке равно: " + digits);
    }
}

