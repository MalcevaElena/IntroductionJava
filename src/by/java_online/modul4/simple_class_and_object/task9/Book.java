package by.java_online.modul4.simple_class_and_object.task9;

public class Book {
    private static int startID = 1;
    private int id;
    private String title;
    private String author;
    private String publishingHouse;
    private int year;
    private int numberOfPages;
    private int price;
    private String bindingType;

    public Book(String title, String author, String publishingHouse, int year,
                int numberOfPages, int price, String bindingType) {
        this.id = startID++;
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return String.format("id: %d, Title: %s, Author: %s, PublishingHouse: %s, " +
                "Year: %d, NumberOfPages: %d, Price: %s, BindingType: %s."
                ,id, title, author, publishingHouse, year, numberOfPages, price, bindingType);
    }
}
