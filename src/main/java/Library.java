import java.util.ArrayList;

public class Library {

    private ArrayList<Book> catalogue;
    private int capacity;

    public Library (int capacity){
        this.capacity = capacity;
        this.catalogue = new ArrayList<>();
    }

    public int countBooks(){
        return this.catalogue.size();
    }

    public void addBook(Book book){
        if (this.canAddBook()) {
            this.catalogue.add(book);
        }
    }

    private boolean canAddBook(){
        if (this.countBooks() < this.capacity){
            return true;
        }
        return false;
    }

    public boolean hasBook(Book book){
        return this.catalogue.contains(book);
    }

    public boolean removeBook(Book book){
        if (this.hasBook(book)){
            return this.catalogue.remove(book);
        }
        return false;
    }
}
