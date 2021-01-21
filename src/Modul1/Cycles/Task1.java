package Modul1.Cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа.
*/
public class Task1 {
    static int number;
    static int sum ;

    public static void main(String[] args) {
        System.out.println("Введите целое положительное число:");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            number = Integer.parseInt(reader.readLine());
            reader.close();
            if (number > 0) {
                for (int i = 1; i <= number; i++) {
                    sum += i;
                }
                System.out.println(sum);
            } else {
                System.out.println("Вы ввели отрицательное число.");
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Вы ввели нецелое положительное число.");
        }
        catch (IOException ex) {
            System.out.println("Ошибка.");
        }
    }
}
