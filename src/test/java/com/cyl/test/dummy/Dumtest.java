package com.cyl.test.dummy;

import com.cyl.mockito.test_doubles.fake.Book;
import com.cyl.mockito.test_doubles.fake.Ebook;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Dumtest {

    private int[] intArray1;

    @Test
    public void testDummy(){

        //List<Number> arrlist = null;
        //arrlist = new ArrayList<Long>();
        //arrlist.add(12.0);

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Ebook("ebook1"));
        bookList.add(new Book());
        System.out.println("######");
        System.out.println(bookList);
        intArray1= new int[]{1, 2, 3};
        int[] intArray = new int[]{1,2,3};
        Book[] books = new Book[]{
                new Book("1231", "a", 100, LocalDate.now()),
                new Book("1232", "b", 200, LocalDate.now()),
                new Book("1233", "c", 300, LocalDate.now()),
        };

        Book book = new Book();
        book.testmethod(books);

    }
}
