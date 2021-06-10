package by.java_online.modul4.simple_class_and_object.task9;
/* Создать класс Book, спецификация которого приведена ниже.
 * Определить конструкторы, set- и get- методы и метод toString().
 * Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 *  a) список книг заданного автора;
 *  b) список книг, выпущенных заданным издательством;
 *  c) список книг, выпущенных после заданного года.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookCase bookCase = new BookCase("Книги по Java", new ArrayList<>());

        bookCase.booksAdd("Философия JAVA", "Брюс Эккель", "Питер",
                2015, 1159, 1500, "Твердый переплет");
        bookCase.booksAdd("JAVA Библиотека профессионала Том 1", "Кей Хорсманн",
                "Диалектика", 2019, 864, 950, "Мягкий переплет");
        bookCase.booksAdd("JAVA Библиотека профессионала Том 2", "Кей Хорсманн",
                "Диалектика", 2020, 965, 1350, "Мягкий переплет");
        bookCase.booksAdd("Изучаем JAVA", "Берт Бейтс и Кэти Сьерра", "Питер",
                2021, 850, 1200, "Твердый переплет");

        System.out.println("Список книг заданного автора: Кей Хорсманн");
        List<Book> author = bookCase.searchByAuthor("Кей Хорсманн");
        ShowBook.printBook(author);

        System.out.println("Список книг, выпущенных заданным издательством: Питер");
        List<Book> publishingHouse = bookCase.searchByPublishingHouse("Питер");
        ShowBook.printBook(publishingHouse);

        System.out.println("Список книг, выпущенных после заданного года: 2019");
        List<Book> year = bookCase.searchByYear(2019);
        ShowBook.printBook(year);

    }
}
