package by.java_online.modul1.cycle;

//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class Task6 {
    public static void main(String[] args) {
        char c;

        for (int i = 0; i < 256; i++) {
            c = (char) i;
            System.out.println("Численное обозначение " + i + " равно символу " + c);
        }
    }
}
