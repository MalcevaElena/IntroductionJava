package by.java_online.modul3.string_array;

// В строке найти количество чисел.

public class Task4 {
    public static void main(String[] args) {
        String string = "654000, ул. Кирова 77, 234";
        int digits = 0;
        for (int i = 0; i < string.length()-1; i++) {
            char ch = string.toCharArray()[i];
            char ch2 = string.toCharArray()[i+1];
            if (Character.isDigit(ch) && !Character.isDigit(ch2)) {
                digits++;
            }
            else if (Character.isDigit(ch2) && i == string.length()-2){
                //если последний символ в строке цифра, то
                digits++;
            }
        }
        System.out.println("Дана строка: " + string);
        System.out.println("Количество чисел в строке равно: " + digits);
    }
}

