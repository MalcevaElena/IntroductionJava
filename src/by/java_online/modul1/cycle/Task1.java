package by.java_online.modul1.cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*  Напишите программу, где пользователь вводит любое целое положительное число.
 *  А программа суммирует все числа от 1 до введенного пользователем числа.
 */

public class Task1 {
    public static void main(String[] args) {
        int number;
        int sum;

        sum = 0;

        @SuppressWarnings("resource")
        Scanner sc;
        sc = new Scanner(System.in);

        do {
            System.out.println("Введите положительное число:");

            while (!sc.hasNextInt()) {
                System.out.println("Вы ввели не число. Повторите попытку.");
                sc.next();
            }

            number = sc.nextInt();
        }
        while (number <= 0);

        for (int i = number; i > 0; i--) {
            sum += i;
        }
        System.out.print("Сумма чисел от 1 до введенного пользователем числа равна: ");
        System.out.println(sum);
    }
}