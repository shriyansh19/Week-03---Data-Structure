package doublylinkedlist.moviemanagement;

/**
 * Represents a doubly linked list for managing movies.
 */
public class MovieList {
    // Node class for the doubly linked list
    private static class Node {
        Movie movie;
        Node prev;
        Node next;

        public Node(Movie movie) {
            this.movie = movie;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    // Add a movie at the beginning of the list
    public void addFirst(Movie movie) {
        Node newNode = new Node(movie);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add a movie at the end of the list
    public void addLast(Movie movie) {
        Node newNode = new Node(movie);
        if (tail == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Add a movie at a specific position
    public void addAtPosition(Movie movie, int position) {
        if (position < 0) {
            throw new IllegalArgumentException("Position cannot be negative.");
        }

        Node newNode = new Node(movie);
        if (position == 0) {
            addFirst(movie);
        } else {
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                if (current == null) {
                    throw new IndexOutOfBoundsException("Position exceeds the list size.");
                }
                current = current.next;
            }
            newNode.next = current.next;
            newNode.prev = current;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
        }
    }

    // Remove a movie by title
    public void removeByTitle(String title) {
        Node current = head;
        while (current != null) {
            if (current.movie.getTitle().equals(title)) {
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
                return;
            }
            current = current.next;
        }
        System.out.println("Movie with title '" + title + "' not found.");
    }

    // Search for movies by director
    public void searchByDirector(String director) {
        Node current = head;
        boolean found = false;
        while (current != null) {
            if (current.movie.getDirector().equals(director)) {
                System.out.println(current.movie);
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("No movies found for director '" + director + "'.");
        }
    }

    // Search for movies by rating
    public void searchByRating(double rating) {
        Node current = head;
        boolean found = false;
        while (current != null) {
            if (current.movie.getRating() == rating) {
                System.out.println(current.movie);
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("No movies found with rating " + rating + ".");
        }
    }

    // Update a movie's rating by title
    public void updateRating(String title, double newRating) {
        Node current = head;
        while (current != null) {
            if (current.movie.getTitle().equals(title)) {
                current.movie.setRating(newRating);
                System.out.println("Rating updated for movie '" + title + "'.");
                return;
            }
            current = current.next;
        }
        System.out.println("Movie with title '" + title + "' not found.");
    }

    // Display all movies in forward order
    public void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.println(current.movie);
            current = current.next;
        }
    }

    // Display all movies in reverse order
    public void displayBackward() {
        Node current = tail;
        while (current != null) {
            System.out.println(current.movie);
            current = current.prev;
        }
    }
}