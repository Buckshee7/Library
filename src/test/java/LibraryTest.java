import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        this.library = new Library(3);
        this.book = new Book("Harry Potter", "J.K.Rowling", "Fantasy");
    }

    @Test
    public void canCountBooks(){
        assertEquals(0, this.library.countBooks());
    }

    @Test
    public void canAddBook(){
        this.library.addBook(this.book);
        assertEquals(1, this.library.countBooks());
    }

    @Test
    public void cantAddBookFullCapacity(){
        this.library.addBook(this.book);
        this.library.addBook(this.book);
        this.library.addBook(this.book);
        this.library.addBook(this.book);
        this.library.addBook(this.book);
        assertEquals(3, this.library.countBooks());
    }


}
