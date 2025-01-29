package doublylinkedlist.librarymanagement;

/**
 * Provides a high-level interface for managing the library.
 */
public class LibraryManager {
    private Library library;

    public LibraryManager() {
        library = new Library();
    }

    // Add a book at the beginning
    public void addBookAtBeginning(Book book) {
        library.addFirst(book);
    }

    // Add a book at the end
    public void addBookAtEnd(Book book) {
        library.addLast(book);
    }

    // Add a book at a specific position
    public void addBookAtPosition(Book book, int position) {
        library.addAtPosition(book, position);
    }

    // Remove a book by Book ID
    public void removeBookById(String bookId) {
        library.removeById(bookId);
    }

    // Search for a book by Title
    public void searchBookByTitle(String title) {
        library.searchByTitle(title);
    }

    // Search for a book by Author
    public void searchBookByAuthor(String author) {
        library.searchByAuthor(author);
    }

    // Update a book's availability status
    public void updateBookAvailability(String bookId, boolean isAvailable) {
        library.updateAvailability(bookId, isAvailable);
    }

    // Display all books in forward order
    public void displayBooksForward() {
        library.displayForward();
    }

    // Display all books in reverse order
    public void displayBooksBackward() {
        library.displayBackward();
    }

    // Get the total number of books in the library
    public int getTotalBooks() {
        return library.getTotalBooks();
    }
}