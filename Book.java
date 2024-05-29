package libraryManagementSystem;

public class Book {

    private String bookName;
    private String author;
    private int edition;

    public Book(String bookName, String author, int edition) {
        this.bookName = bookName;
        this.author = author;
        this.edition = edition;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
}
