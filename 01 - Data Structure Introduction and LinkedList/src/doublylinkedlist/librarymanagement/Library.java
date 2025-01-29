package doublylinkedlist.librarymanagement;

/**
 * Represents a doubly linked list for managing books in the library.
 */
public class Library {
    // Node class for the doubly linked list
    private static class Node {
        Book book;
        Node prev;
        Node next;

        public Node(Book book) {
            this.book = book;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // Constructor
    public Library() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Add a book at the beginning of the list
    public void addFirst(Book book) {
        Node newNode = new Node(book);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // Add a book at the end of the list
    public void addLast(Book book) {
        Node newNode = new Node(book);
        if (tail == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Add a book at a specific position
    public void addAtPosition(Book book, int position) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException("Invalid position.");
        }
        if (position == 0) {
            addFirst(book);
        } else if (position == size) {
            addLast(book);
        } else {
            Node newNode = new Node(book);
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
            size++;
        }
    }

    // Remove a book by Book ID
    public void removeById(String bookId) {
        Node current = head;
        while (current != null) {
            if (current.book.getBookId().equals(bookId)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                size--;
                System.out.println("Book with ID '" + bookId + "' removed.");
                return;
            }
            current = current.next;
        }
        System.out.println("Book with ID '" + bookId + "' not found.");
    }

    // Search for a book by Title
    public void searchByTitle(String title) {
        Node current = head;
        boolean found = false;
        while (current != null) {
            if (current.book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(current.book);
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("No books found with title '" + title + "'.");
        }
    }

    // Search for a book by Author
    public void searchByAuthor(String author) {
        Node current = head;
        boolean found = false;
        while (current != null) {
            if (current.book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(current.book);
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("No books found by author '" + author + "'.");
        }
    }

    // Update a book's availability status by Book ID
    public void updateAvailability(String bookId, boolean isAvailable) {
        Node current = head;
        while (current != null) {
            if (current.book.getBookId().equals(bookId)) {
                current.book.setAvailable(isAvailable);
                System.out.println("Availability updated for book ID '" + bookId + "'.");
                return;
            }
            current = current.next;
        }
        System.out.println("Book with ID '" + bookId + "' not found.");
    }

    // Display all books in forward order
    public void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.println(current.book);
            current = current.next;
        }
    }

    // Display all books in reverse order
    public void displayBackward() {
        Node current = tail;
        while (current != null) {
            System.out.println(current.book);
            current = current.prev;
        }
    }

    // Count the total number of books in the library
    public int getTotalBooks() {
        return size;
    }
}