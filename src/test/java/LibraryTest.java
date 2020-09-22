import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book book2;

    @Before
    public void before(){
        this.library = new Library(3);
        this.book = new Book("Lies of Locke Lamora", "Scott Lynch", "Fantasy");
        this.book2 = new Book("The Name of the Wind", "Patrick Rothfuss", "Fantasy");
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

    @Test
    public void canRemoveBookWhenExists(){
        this.library.addBook(this.book);
        this.library.removeBook(this.book);
        assertEquals(0, this.library.countBooks());
    }

    @Test
    public void cantRemoveBookWhenNotExists(){
        this.library.addBook(this.book);
        this.library.removeBook(this.book2);
        assertEquals(1, this.library.countBooks());
    }

    @Test
    public void canGetGenreCountHash(){
        this.library.addBook(this.book);
        this.library.addBook(this.book2);
        HashMap genreCount = this.library.getGenreCount();
        assertEquals(2, genreCount.get("Fantasy"));
    }

}
