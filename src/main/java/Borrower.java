import java.util.ArrayList;

public class Borrower {
//    don't currently need name
    private String name;
    private ArrayList<Book> loan;

    public Borrower(String name) {
        this.loan = new ArrayList<>();
        this.name = name;
    }

    public int loanCount() {
        return this.loan.size();
    }
}
