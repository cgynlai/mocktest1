package com.cyl.mockito.test_doubles.fake;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(Book1 book1){
        bookRepository.save(book1);
    }

    public int findNumberOfBooks(){
        return bookRepository.findAll().size();
    }

}

