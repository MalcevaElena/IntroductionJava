package by.java_online.modul3.string_stringbuilder;

//С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

public class Task4 {
    public static void main(String[] args) {
        String string = "информатика";
        String tort = String.valueOf(string.charAt(string.indexOf("т"))) +
                String.valueOf(string.charAt(string.indexOf("о"))) +
                String.valueOf(string.charAt(string.indexOf("р"))) +
                String.valueOf(string.charAt(string.indexOf("т")));

        System.out.println(tort);
    }
}
