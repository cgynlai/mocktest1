package com.cyl.test.dummy;

import com.cyl.exception.SelfDefineException1;
import com.cyl.mockito.test_doubles.fake.Book;
import com.cyl.mockito.test_doubles.fake.Ebook;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Dumtest {

    private int[] intArray1;

    void method1() throws SelfDefineException1{
      throw new SelfDefineException1("self define err msg");
    }

    @Test
    public void testDummy()  {

        //List<Number> arrlist = null;
        //arrlist = new ArrayList<Long>();
        //arrlist.add(12.0);

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Ebook("ebook1"));  // not a good practice to add subtype, elements of list should be identical
        // so that when iterating the elements we can use same method to do same thing.
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
        System.out.println("111111111111*******************************************");

// demo exception handling , try-catch
        try{
            int a = 1/0;
            System.out.println("a is:  " + a);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("after a calculation ...");

        //self define exceptions

        try {
            method1();
       // } catch (SelfDefineException1 e) {
        } catch (NullPointerException e) {
            //throw new RuntimeException(e);
            System.out.println("catch block method1()");
        }finally {
            System.out.println(" finally block after method1()");
        }
        // unhandled runtime exception, code below it will not execute
        //method1();
        System.out.println("after method1()");


    }
}
