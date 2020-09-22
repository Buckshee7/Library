import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowed;

    public Borrower(){
        this.borrowed = new ArrayList<>();
    }

    public ArrayList<Book> getBorrowedBooks(){
        return this.borrowed;
    }

    public void borrowBook(Book book, Library library){
        if (library.removeBook(book)){
            this.borrowed.add(book);
        }
    }
}
