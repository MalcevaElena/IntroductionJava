package by.java_online.modul4.simple_class_and_object.task9;

import java.util.ArrayList;
import java.util.List;

public class BookCase {
    private String name;
    private List<Book> books;

    public BookCase(List<Book> books) {
        this.name = "Детективы";
        this.books = books;
    }

    public BookCase(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public void booksAdd(String title, String author, String publishingHouse, int year,
                         int numberOfPages, int price, String bindingType) {
        this.books.add(new Book(title, author, publishingHouse, year, numberOfPages, price, bindingType));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().equals(author)) {
                result.add(books.get(i));
            }
        }
        return result;
    }

    public List<Book> searchByPublishingHouse(String publishingHouse) {
        List<Book> result = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getPublishingHouse().equals(publishingHouse)) {
                result.add(books.get(i));
            }
        }
        return result;
    }

    public List<Book> searchByYear(int year) {
        List<Book> result = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getYear() > year) {
                result.add(books.get(i));
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookCase bookCase = (BookCase) o;

        if (name != null ? !name.equals(bookCase.name) : bookCase.name != null) return false;
        return books != null ? books.equals(bookCase.books) : bookCase.books == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (books != null ? books.hashCode() : 0);
        return result;
    }
}
