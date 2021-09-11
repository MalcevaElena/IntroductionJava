package by.java_online.modul4.aggregation_and_composition.task1.main;

/* Создать объект класса Текст,
 * используя классы Предложение, Слово.
 * Методы: дополнить текст, вывести на консоль: текст, заголовок текста.
 */

import by.java_online.modul4.aggregation_and_composition.task1.show.Show;
import by.java_online.modul4.aggregation_and_composition.task1.entity.Sentence;
import by.java_online.modul4.aggregation_and_composition.task1.entity.Text;
import by.java_online.modul4.aggregation_and_composition.task1.entity.Word;

public class Main {
    public static void main(String[] args) {
        // Создаем 5 слов
        Word word1 = new Word("Первое");
        Word word2 = new Word("Второе");
        Word word3 = new Word("предложение");
        Word word4 = new Word(".");
        Word word5 = new Word(" ");

        // помещаем слова в первое предложение
        Sentence sentenceOne = new Sentence();
        sentenceOne.add(word1);
        sentenceOne.add(word5);
        sentenceOne.add(word3);
        sentenceOne.add(word4);

        // помещаем слова во второе предложение
        Sentence sentenceTwo = new Sentence();
        sentenceTwo.add(word2);
        sentenceTwo.add(word5);
        sentenceTwo.add(word3);
        sentenceTwo.add(word4);

        // создаем предложение "Заголовок"
        Sentence headerSentence = new Sentence();
        headerSentence.add(new Word("Сочинение "));
        headerSentence.add(new Word("про лето."));

        Text text = new Text();
        text.getHeader().add(headerSentence);
        text.getBody().add(sentenceOne);
        text.getBody().add(sentenceTwo);

        Show show = new Show();
        System.out.println("Заголовок: ");
        show.printHeader(text);
        System.out.println("Текст: ");
        show.printBody(text);
    }
}
