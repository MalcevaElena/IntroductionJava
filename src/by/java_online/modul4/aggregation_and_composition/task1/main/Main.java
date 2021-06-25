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
        // Создаем 6 слов
        Word word1 = new Word("Сочинение");
        Word word2 = new Word(".");
        Word word3 = new Word();
        Word word4 = new Word("Первое");
        Word word5 = new Word("предложение");
        Word word6 = new Word("Второе");

        // помещаем слова в первое предложение
        Sentence sentenceOne = new Sentence();
        sentenceOne.getSentenceList().append(word4.getValue());
        sentenceOne.getSentenceList().append(word3.getValue());
        sentenceOne.getSentenceList().append(word5.getValue());
        sentenceOne.getSentenceList().append(word2.getValue());

        // помещаем слова во второе предложение
        Sentence sentenceTwo = new Sentence();
        sentenceTwo.getSentenceList().append(word6.getValue());
        sentenceTwo.getSentenceList().append(word3.getValue());
        sentenceTwo.getSentenceList().append(word5.getValue());
        sentenceTwo.getSentenceList().append(word2.getValue());

        // создаем предложение "Заголовок"
        Sentence headerSentence = new Sentence();
        headerSentence.getSentenceList().append("Cочинение ");
        headerSentence.getSentenceList().append("про лето.");

        Text text = new Text(headerSentence);
        text.getBody().add(sentenceOne);
        text.getBody().add(sentenceTwo);

        Show show = new Show();
        System.out.println("Заголовок: ");
        show.printHeader(text);
        System.out.println("Текст: ");
        show.printBody(text);
    }
}
