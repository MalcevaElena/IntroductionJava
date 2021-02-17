package by.java_online.modul1.cycles;

/* Для каждого натурального числа в промежутке от m до n вывести все делители,
 * кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
    public static void main(String[] args) {
        int m;
        int n;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите положительное целое число m:");
            m = Integer.parseInt(reader.readLine());
            System.out.println("Введите положительное целое число n:");
            n = Integer.parseInt(reader.readLine());
            reader.close();
            if (m >= 0 && n >= 0 && m <= n) {
                for (int i = m; i <= n; i++) {
                    System.out.print("Делители для числа " + i + ": ");
                    for (int y = 2; y < n; y++) {
                        if (i % y == 0 && i != y) {
                            System.out.print(y + " ");
                        }
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Вы ввели отрицательное число или m меньше n.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели нецелое число.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
