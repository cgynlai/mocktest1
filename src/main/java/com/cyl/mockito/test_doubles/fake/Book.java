package com.cyl.mockito.test_doubles.fake;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {
    private String bookId;
    private String title;
    private int price;
    private LocalDate publishedDate;

    public Book() {
    }

    public Book(String bookId, String title, int price, LocalDate publishedDate) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.publishedDate = publishedDate;
    }

    public void testmethod(Book[] book) {
       /* List<Book> list = Arrays.asList(new Book[]{
                new Book("123", "Ghost", 150, LocalDate.now())});*/

        List<Book> list = new ArrayList<Book>();
        List<Book> books = Arrays.asList(book);

        list.addAll(books);
        System.out.println(list instanceof List);
        System.out.println(list instanceof ArrayList);


        System.out.println(Arrays.asList(book));

    }


    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + "'" +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", publishedDate=" + publishedDate +
                '}';
    }
}
