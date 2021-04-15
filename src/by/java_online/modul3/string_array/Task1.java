package by.java_online.modul3.string_array;

//Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String[] camelCase = {"maxNumber", "minNumber", "someCounter", "bigShip"};
        String[] snake_case = formatSnake(camelCase);

        System.out.println("Дан массив названий переменных в camelCase:");
        System.out.println(Arrays.toString(camelCase));
        System.out.println("Преобразовываем названия в snake_case.");
        System.out.println(Arrays.toString(snake_case));
    }

    public static String[] formatSnake(String[] str) {
        String[] snake = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            StringBuilder strBuilder = new StringBuilder();
            for (int j = 0; j < str[i].length(); j++) {
                char ch = str[i].toCharArray()[j];
                if (Character.isLowerCase(ch)) {
                    strBuilder.append(ch);
                } else {
                    strBuilder.append("_");
                    strBuilder.append(Character.toLowerCase(ch));
                }
            }
            snake[i] = strBuilder.toString();
        }
        return snake;
    }
}

