package doublylinkedlist.texteditor;

/**
 * Represents a doubly linked list for managing text states (undo/redo functionality).
 */
public class TextHistory {
    // Node class for the doubly linked list
    private static class Node {
        TextState state;
        Node prev;
        Node next;

        public Node(TextState state) {
            this.state = state;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private Node current; // Points to the current state
    private int size;
    private final int maxSize; // Maximum number of states to store

    // Constructor
    public TextHistory(int maxSize) {
        this.head = null;
        this.tail = null;
        this.current = null;
        this.size = 0;
        this.maxSize = maxSize;
    }

    // Add a new text state
    public void addState(TextState state) {
        Node newNode = new Node(state);

        if (head == null) {
            // If the list is empty
            head = tail = current = newNode;
        } else {
            // Add the new state at the end
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            current = newNode; // Update current to the new state
        }

        size++;

        // If the size exceeds the maximum limit, remove the oldest state
        if (size > maxSize) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo functionality (revert to the previous state)
    public TextState undo() {
        if (current == null || current.prev == null) {
            System.out.println("Nothing to undo.");
            return null;
        }
        current = current.prev; // Move to the previous state
        return current.state;
    }

    // Redo functionality (revert to the next state)
    public TextState redo() {
        if (current == null || current.next == null) {
            System.out.println("Nothing to redo.");
            return null;
        }
        current = current.next; // Move to the next state
        return current.state;
    }

    // Get the current state
    public TextState getCurrentState() {
        return current != null ? current.state : null;
    }

    // Display all states (for debugging purposes)
    public void displayHistory() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.state);
            temp = temp.next;
        }
    }
}