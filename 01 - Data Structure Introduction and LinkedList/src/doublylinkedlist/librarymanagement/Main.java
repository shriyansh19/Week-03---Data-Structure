package doublylinkedlist.librarymanagement;

/**
 * Main class to demonstrate the Library Management System.
 */
public class Main {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        // Add books
        manager.addBookAtBeginning(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", "B001"));
        manager.addBookAtEnd(new Book("1984", "George Orwell", "Dystopian", "B002"));
        manager.addBookAtPosition(new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", "B003"), 1);

        // Display books
        System.out.println("Books in forward order:");
        manager.displayBooksForward();
        System.out.println("Books in reverse order:");
        manager.displayBooksBackward();

        // Search books
        System.out.println("Books by F. Scott Fitzgerald:");
        manager.searchBookByAuthor("F. Scott Fitzgerald");
        System.out.println("Books with title '1984':");
        manager.searchBookByTitle("1984");

        // Update availability
        manager.updateBookAvailability("B001", false);

        // Remove a book
        manager.removeBookById("B002");
        System.out.println("Books after removal:");
        manager.displayBooksForward();

        // Get total number of books
        System.out.println("Total number of books: " + manager.getTotalBooks());
    }
}