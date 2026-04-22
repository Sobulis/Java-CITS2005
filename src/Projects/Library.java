package Projects;
import java.util.ArrayList;

class BorrowRecord {
    String bookTitle;
    String borrowerName;

    public BorrowRecord(String bookTitle, String borrowerName) {
        this.bookTitle = bookTitle;
        this.borrowerName = borrowerName;
    }
}

public class Library {
    private ArrayList<BorrowRecord> records;

    public Library() {
        records = new ArrayList<BorrowRecord>();
    }

    public void addBorrow(String bookTitle, String borrowerName) {
        records.add(new BorrowRecord(bookTitle, borrowerName));
    }

    public void returnBook(String bookTitle) {
        for (int i = 0; i < records.size(); i++){
            if (records.get(i).bookTitle.equals(bookTitle)) {
                records.remove(i);
                return;
            }
        }
    }

    public int countBorrowedBy(String borrowerName) {
        int count = 0;
        for (BorrowRecord br: records){
            if (br.borrowerName.equals(borrowerName)){
                count ++;
            }
        }
        return count;
    }

    public boolean isBorrowed(String bookTitle) {
        for (BorrowRecord br: records){
            if (br.bookTitle.equals(bookTitle)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Library lib = new Library();

        // You can test your implementation with examples like:
         lib.addBorrow("The Hobbit", "Alice");
         lib.addBorrow("Dune", "Bob");
         lib.addBorrow("LOTR", "Alice");
         System.out.println(lib.countBorrowedBy("Alice"));
         System.out.println(lib.isBorrowed("Dune"));
         lib.returnBook("Dune");
         System.out.println(lib.isBorrowed("Dune"));
    }
}

