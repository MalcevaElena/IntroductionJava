package by.java_online.modul1.cycles;

import java.math.BigInteger;

// Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task4 {
    public static void main(String[] args) {
        BigInteger s = BigInteger.valueOf(1);
        for (int i = 2; i <= 200; i++) {
            s = s.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println(s);
    }
}
