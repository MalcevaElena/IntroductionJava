package by.java_online.modul3.string_stringbuilder;

// Проверить, является ли заданное слово палиндромом.

public class Task3 {
    public static void main(String[] args) {
        String stringOne = "Level";
        String stringTwo = "Number";

        System.out.println("Слово " + stringOne + " " + palindrome(stringOne));
        System.out.println("Слово " + stringTwo + " " + palindrome(stringTwo));

    }

    private static String palindrome(String str) {
        boolean palindrome = false;
        for (int i = 0; i < str.length() / 2; i++) {
            char one = str.charAt(i);
            char two = str.charAt(str.length() - i - 1);
            if (one == two) {
                palindrome = true;
            } else {
                palindrome = false;
            }

        }
        return palindrome ? "является палиндромом" : "не является палиндромом";
    }
}
