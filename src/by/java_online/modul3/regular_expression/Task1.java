package by.java_online.modul3.regular_expression;
/* Создать приложение, разбирающее текст (текст хранится в строке)
 * и позволяющее выполнять с текстом три различных операции:
 * отсортировать абзацы по количеству предложений;
 * в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества
 * вхождений заданного символа, а в случае равенства – по алфавиту.
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        int enterNumber;
        String text;

        text = "Работа благотворна, и ее хватит на всех." +
                "Она помогает уберечься от скуки и зла." +
                "Она полезна для здоровья тела и духа." +
                "Она дает нам чувство силы и независимости больше." +
                "Чем деньги или элегантность.\n" +
                "Что ты здесь делаешь? - спросил Медвежонок." +
                "Жду, когда ты выздоровеешь, - ответил Ежик.\n" +
                "Долго?" +
                "Всю зиму. Я, как узнал, что ты объелся снегом," +
                "сразу перетащил все свои припасы к тебе.\n" +
                "И всю зиму ты сидел возле меня на табуретке?" +
                "Да. Я поил тебя еловым отваром и прикладывал к животу сушёную травку." +
                "Не помню, - сказал Медвежонок." +
                "Ещё бы! - вздохнул Ежик." +
                "Ты всю зиму говорил, что ты - снежинка." +
                "Я так боялся, что ты растаешь к весне.";

        enterNumber = enterToConsole();

        switch (enterNumber) {
            case 1:
                sortedNumberSentences(text);
                // сортировка по кол-ву предложений в абзаце
                break;
            case 2:
                sortWordLength(text);
                // сортировка по длине слов в предложении
                break;
            case 3:
                sortLexeme(text);
                // сортировка слов по кол-ву вхождений лексемы
                break;
            default:
        }
    }

    public static int enterToConsole() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("""
                    - Введите "1" для сортировки абзацев по количеству предложений;\s
                    - введите "2" для сортировки в каждом предложении слов по длине;\s
                    - введите "3" для сортировки лексем в предложениях по убыванию количества\s
                      вхождений заданного символа, а в случае равенства - по алфавиту.
                    """);

            while (!sc.hasNextInt()) {
                System.out.println("Вы ввели нечисло. Повторите попытку.");
                sc.next();
            }
            number = sc.nextInt();
        }
        while (number < 0 || number > 3);

        return number;
    }

    public static void sortedNumberSentences(String str) {
        String tempParagraph;
        String[] paragraph;

        paragraph = splitParagraph(str);
        //считаем кол-во предлажений и производим сортировку
        for (int i = 0; i < paragraph.length; i++) {
            String[] sizeI = splitSentences(paragraph[i]);
            for (int j = paragraph.length - 1; j > i; j--) {
                String[] sizeJ = splitSentences(paragraph[j]);
                if (sizeI.length > sizeJ.length) {
                    tempParagraph = paragraph[i];
                    paragraph[i] = paragraph[j];
                    paragraph[j] = tempParagraph;
                }
            }
            System.out.println(paragraph[i]);
        }

    }

    public static void sortWordLength(String str) {
        String tmp;
        String[] sentences;

        sentences = splitSentences(str);

        for (String sentence : sentences) {
            String[] words = splitWords(sentence);
            for (int j = 0; j < words.length; j++) {
                for (int k = words.length - 1; k > j; k--) {
                    if (words[j].length() > words[k].length()) {
                        tmp = words[j];
                        words[j] = words[k];
                        words[k] = tmp;
                    }
                }
                System.out.print(words[j] + " ");
            }
            System.out.println();
        }
    }

    public static void sortLexeme(String str) {
        String[] words;
        Pattern patternLexeme;
        Matcher matcher;
        int countI;
        int countJ;
        String tmp;

        patternLexeme = Pattern.compile("[Оо]"); //Лексема "O" или "o"

        words = splitWords(str); // делим текст на слова

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = words.length - 1; j > i; j--) {
                // считаем кол-во вхождений
                countI = 0;
                matcher = patternLexeme.matcher(words[i]);

                while (matcher.find()) {
                    countI++;
                }

                countJ = 0;
                matcher = patternLexeme.matcher(words[j]);

                while (matcher.find()) {
                    countJ++;
                }

                if (countJ > countI) {  //сравниваем количесво вхождений
                    tmp = words[i];
                    words[i] = words[j];
                    words[j] = tmp;

                } else if (countJ == countI) { //если количество вхождений равно, сортировка по алфавиту

                    String[] twoWords = {words[i], words[j]};
                    Arrays.sort(twoWords, String.CASE_INSENSITIVE_ORDER);
                    words[i] = twoWords[0];
                    words[j] = twoWords[1];
                }
            }
            System.out.println(words[i]);
        }
    }

    private static String[] splitParagraph(String text) {
        Pattern pattern = Pattern.compile("\n");
        return pattern.split(text);
    }

    private static String[] splitSentences(String text) {
        Pattern pattern = Pattern.compile("[.!?\n]+");
        return pattern.split(text);
    }

    private static String[] splitWords(String sentence) {
        Pattern pattern = Pattern.compile("[-.!?,;:\n ]+");
        return pattern.split(sentence);
    }
}