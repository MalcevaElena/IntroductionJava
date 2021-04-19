package by.java_online.modul2.array_of_array;
/* Магическим квадратом порядка n называется квадратная матрица размера nxn,
 * составленная из чисел 1, 2, 3, n2 так, что суммы по каждому столбцу,
 *  каждой строке и каждой из двух больших диагоналей равны между
 * собой. Построить такой квадрат.
 */

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        int n;
        int[][] matrix;

        n = enterToConsole();

        if (n % 2 != 0) {
            matrix = oddMagicSquare(n);
        } else if (n % 4 == 0) {
            matrix = evenMagicSquare(n);
        } else {
            matrix = otherEvenMagicSquare(n);
        }

        printMatrix(matrix, n);
    }

    public static int enterToConsole() {
        int number;

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Введите размер магического квадрата: ");

            while (!sc.hasNextInt()) {
                System.out.println("Вы ввели не число. Повторите попытку.");
                sc.next();
            }
            number = sc.nextInt();
            if (number < 3) {
                System.out.printf("Магический квадрат порядка %d не существует.%n", number);
            }
        }
        while (number < 3);

        return number;
    }

    public static void fillMatrix(int[][] matrix) {
        //заполнение магического квадрата от 1 до n
        int count = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = count;
                count++;
            }
        }
    }

    public static void printMatrix(int[][] arrays, int n) {
        System.out.printf("Магический квадрат %dx%d:%n", n, n);
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.printf("%3d\t", arrays[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] oddMagicSquare(int n) {
        int a;
        int b;
        int[][] magicSquare;

        magicSquare = new int[n][n];
        a = n - 1; // Получаем нижний индекс последней строки
        b = n / 2; // Получить нижний индекс среднего столбца
        fillMatrix(magicSquare);

        for (int i = 1; i <= n * n; i++) {
            magicSquare[a++][b++] = i; // Присваиваем среднему элементу последней строки значение 1
            if (i % n == 0) {// Определяем, является ли текущее значение i кратным n
                // Если да, то помещаем в тот же столбец верхней строки
                a = a - 2;
                b = b - 1;
            } else {
                // В противном случае поместите его в следующий столбец строки
                a = a % n;
                b = b % n;
            }
        }
        return magicSquare;
    }

    public static int[][] evenMagicSquare(int n) {
        int c1;
        int c2;
        int[][] magicSquare;

        magicSquare = new int[n][n];
        c1 = 1;
        c2 = n * n;
        fillMatrix(magicSquare);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 4 == j % 4 || (i + j) % 4 == 3) {  // Диагональ перевернута
                    magicSquare[i][j] = c2;
                } else {  // Недиагональный передний ряд
                    magicSquare[i][j] = c1;
                }
                c2--;
                c1++;
            }
        }
        return magicSquare;
    }

    public static int[][] otherEvenMagicSquare(int n) {
        int size;
        int[][] oddSquare;
        int[][] magicSquare;
        int[][] supportingSquare;

        size = n / 2;
        oddSquare = oddMagicSquare(size); // создаем магический квадрат нечетного порядка

        for (int i = 0; i < oddSquare.length; i++) {
            for (int j = 0; j < oddSquare[i].length; j++) {
                //меняем числа 1,2,3.. size, на 1,5,9...
                if (oddSquare[i][j] != 1) {
                    oddSquare[i][j] = 4 * oddSquare[i][j] - 3;
                }
            }
        }

        magicSquare = new int[n][n];
        // замолняем магический квадрат размера n, цифрами из магического квадрата порядка size
        for (int i = 0, h = 0; i < magicSquare.length; i += 2, h++) {
            for (int j = 0, k = 0; j < magicSquare[i].length; j += 2, k++) {
                magicSquare[i][j] = oddSquare[h][k];
                magicSquare[i][j + 1] = oddSquare[h][k];
                magicSquare[i + 1][j] = oddSquare[h][k];
                magicSquare[i + 1][j + 1] = oddSquare[h][k];
            }
        }

        supportingSquare = new int[n][n];
        //создаем вспомогательный квадрат с цифрами от 0 до 3
        for (int i = 0; i < supportingSquare.length; i++) {
            for (int j = 0; j < supportingSquare[i].length; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        supportingSquare[i][j] = 1;
                    } else {
                        supportingSquare[i][j] = 2;
                    }
                } else if (j % 2 == 0) {
                    supportingSquare[i][j] = 3;
                } else {
                    supportingSquare[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare[i].length; j++) {
                magicSquare[i][j] = magicSquare[i][j] + supportingSquare[i][j];
            }
        }
        return magicSquare;
    }
}