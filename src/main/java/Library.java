import java.util.ArrayList;

public class Library {

    ArrayList<Book> book;

    public Library(){
        this.book = new ArrayList<>();

    }





    public void addBook(Book book) {
        this.book.add(book);
    }

    public int bookCount() {
        return this.book.size();
    }




}
