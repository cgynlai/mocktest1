package com.cyl.mockito.test_doubles.fake;

import java.util.Collection;

public interface BookRepository {
       void save(Book1 book1);
       Collection<Book1> findAll();
}
