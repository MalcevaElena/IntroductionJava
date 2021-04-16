package by.java_online.modul3.string_array;

//Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

public class Task1 {
    public static void main(String[] args) {
        String[] camelCase = {"maxNumber", "minNumber", "someCounter", "bigShip"};
        String[] snake_case = formatSnake(camelCase);

        System.out.println("Дан массив названий переменных в camelCase:");
        printArray(camelCase);
        System.out.println("Преобразовываем массив названий в snake_case.");
        printArray(snake_case);
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
    public static void printArray (String [] str){
        for (String string: str) {
            System.out.print(string + "; ");

        }
        System.out.println();
    }
}

