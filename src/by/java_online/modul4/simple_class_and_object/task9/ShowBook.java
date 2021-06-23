package by.java_online.modul4.simple_class_and_object.task9;

import java.util.List;

public class ShowBook {
    public static void printBook(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
