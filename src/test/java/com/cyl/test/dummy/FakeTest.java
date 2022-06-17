package com.cyl.test.dummy;

import com.cyl.mockito.test_doubles.fake.Book1;
import com.cyl.mockito.test_doubles.fake.BookRepository;
import com.cyl.mockito.test_doubles.fake.BookService;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FakeTest {

    @Test
    public void testFake(){
        BookRepository bookRepository = new FakeBookRepository();
        BookService bookService = new BookService(bookRepository);

        bookService.addBook(new Book1("001","book entity 1", 120, LocalDate.now()));
        bookService.addBook(new Book1("002","book entity 2", 1500, LocalDate.now()));

        assertEquals(2,bookService.findNumberOfBooks());
    }
}
