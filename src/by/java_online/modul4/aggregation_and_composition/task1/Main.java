package by.java_online.modul4.aggregation_and_composition.task1;

/* Создать объект класса Текст,
 * используя классы Предложение, Слово.
 * Методы: дополнить текст, вывести на консоль: текст, заголовок текста.
 */

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
        sentenceOne.getSentenceList().append(word4);
        sentenceOne.getSentenceList().append(word3);
        sentenceOne.getSentenceList().append(word5);
        sentenceOne.getSentenceList().append(word2);

        // помещаем слова во второе предложение
        Sentence sentenceTwo = new Sentence();
        sentenceTwo.getSentenceList().append(word6);
        sentenceTwo.getSentenceList().append(word3);
        sentenceTwo.getSentenceList().append(word5);
        sentenceTwo.getSentenceList().append(word2);

        // создаем предложение "Заголовок"
        Sentence headerSentence = new Sentence();
        headerSentence.getSentenceList().append(word1);
        headerSentence.getSentenceList().append(word2);

        Text text = new Text(headerSentence);
        text.getBody().add(sentenceOne);
        text.getBody().add(sentenceTwo);

        System.out.println("Заголовок: " + text.getHeader());
        System.out.println("Текст: " + text.getBody());
    }
}
