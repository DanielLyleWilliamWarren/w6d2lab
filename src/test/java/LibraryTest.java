import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;


    @Before
    public void before() {
        library = new Library(5);
        book = new Book();
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }


    @Test
    public void stockStartsEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void isCapacityExceeded() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.bookCount());
    }


}
