import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void before(){
        borrower = new Borrower("Simon");
        book = new Book(GenreType.CRIME);
        library = new Library(5);
        library.addBook(book);
    }
    @Test
    public void noExistingLoan(){
        assertEquals(0, borrower.loanCount());
    }

    @Test
    public void canLoanBook(){
        borrower.takeBookFromLibrary(library);
        assertEquals(1, borrower.loanCount());
    }
    @Test
    public void shouldReturnAllLoans(){
        borrower.takeBookFromLibrary(library);
        borrower.returnBook();
        assertEquals(0, borrower.loanCount());
    }

}
