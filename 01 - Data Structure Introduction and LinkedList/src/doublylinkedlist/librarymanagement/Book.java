package doublylinkedlist.librarymanagement;

/**
 * Represents a book with title, author, genre, book ID, and availability status.
 */
public class Book {
    private String title;
    private String author;
    private String genre;
    private String bookId;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author, String genre, String bookId) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = true; // By default, a book is available
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", bookId='" + bookId + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}