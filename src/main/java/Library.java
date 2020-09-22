import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> catalogue;
    private int capacity;
    private HashMap<String, Integer> genreCount;

    public Library (int capacity){
        this.capacity = capacity;
        this.catalogue = new ArrayList<>();
        this.genreCount = new HashMap();
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

    public HashMap<String, Integer> getGenreCount(){
        for(Book book : this.catalogue){
            String genre = book.getGenre();
            if(this.genreCount.containsKey(genre)){
                this.genreCount.put(genre, genreCount.get(genre)+1);
            } else {
                this.genreCount.put(genre, 1);
            }
        }
        return this.genreCount;
    }
}
