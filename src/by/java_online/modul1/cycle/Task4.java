package by.java_online.modul1.cycle;

// Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task4 {
    public static void main(String[] args) {
        int multiplication;
        multiplication = 1;

        for (int i = 2; i <= 200; i++) {
            if (multiplication < 2_147_483_647) {
                multiplication *= Math.pow(i, 2);
            } else {
                System.out.println("Произошло переполнение int," +
                        " при нахождения произведения квадратов первых" + i + "и чисел.");
                break;
            }
        }
        System.out.println(multiplication);
    }
}
