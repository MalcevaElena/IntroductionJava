package by.java_online.modul1.cycles;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) {
        int one = 145728;
        int two = 834753;

        ArrayList<Integer> valueElementsOne = new ArrayList<>();
        ArrayList<Integer> valueElementsTwo = new ArrayList<>();

        for (int i = one; i > 0; i /= 10) { //разбиваеи число на отдельные числа
             int b = i % 10;
             valueElementsOne.add(b);
        }
        for (int y = two; y > 0; y /= 10) {
            int c = y % 10;
            valueElementsTwo.add(c);
        }
        System.out.print("Цифры, входящие в запись как первого так и второго числа: ");

        for (int e = 0; e < valueElementsOne.size() ; e++) { //проверяем числа на совпадения
            int elementOne = valueElementsOne.get(e);
            for (int y = 0; y < valueElementsTwo.size(); y++) {
                int elementTwo = valueElementsTwo.get(y);
                if (elementOne == elementTwo) {
                    System.out.print(elementOne +" ");
                    break;
                }
            }
        }
    }
}
