package com.cyl.test.dummy;

import com.cyl.mockito.test_doubles.fake.Book1;
import com.cyl.mockito.test_doubles.fake.BookRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FakeBookRepository implements BookRepository {

    Map<String, Book1> bookStore = new HashMap<>();
    @Override
    public void save(Book1 book1) {
        bookStore.put(book1.getBookId(), book1);
    }


    @Override
    public Collection<Book1> findAll() {
        return bookStore.values();
    }
}
