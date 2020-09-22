import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book;
    private Book book2;

    @Before
    public void before(){
        this.borrower = new Borrower();
        this.library = new Library(3);
        this.book = new Book("Lies of Locke Lamora", "Scott Lynch", "Fantasy");
        this.book2 = new Book("The Name of the Wind", "Patrick Rothfuss", "Fantasy");
    }

    @Test
    public void canGetBorrowedBooks(){
        ArrayList borrowedBooks = borrower.getBorrowedBooks();
        assertEquals(0, borrowedBooks.size());
    }

    @Test
    public void canBorrowIfLibraryHasBook(){
        this.library.addBook(this.book);
        this.borrower.borrowBook(this.book, this.library);
        assertEquals(0, this.library.countBooks());
        assertEquals(true, borrower.getBorrowedBooks().contains(this.book));
    }

    @Test
    public void cantBorrowIfLibraryHasntBook(){
        this.library.addBook(this.book2);
        this.borrower.borrowBook(this.book, this.library);
        assertEquals(1, this.library.countBooks());
        assertEquals(0, borrower.getBorrowedBooks().size());
    }

}
