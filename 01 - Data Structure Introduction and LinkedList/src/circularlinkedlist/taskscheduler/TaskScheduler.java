package circularlinkedlist.taskscheduler;

/**
 * Represents a circular linked list for managing tasks in the task scheduler.
 */
public class TaskScheduler {
    // Node class for the circular linked list
    private static class Node {
        Task task;
        Node next;

        public Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private Node current; // Points to the current task
    private int size;

    // Constructor
    public TaskScheduler() {
        this.head = null;
        this.tail = null;
        this.current = null;
        this.size = 0;
    }

    // Add a task at the beginning of the list
    public void addFirst(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            // If the list is empty
            head = tail = newNode;
            tail.next = head; // Make it circular
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head; // Maintain circularity
        }
        size++;
    }

    // Add a task at the end of the list
    public void addLast(Task task) {
        Node newNode = new Node(task);
        if (tail == null) {
            // If the list is empty
            head = tail = newNode;
            tail.next = head; // Make it circular
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Maintain circularity
        }
        size++;
    }

    // Add a task at a specific position
    public void addAtPosition(Task task, int position) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException("Invalid position.");
        }
        if (position == 0) {
            addFirst(task);
        } else if (position == size) {
            addLast(task);
        } else {
            Node newNode = new Node(task);
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }

    // Remove a task by Task ID
    public void removeById(String taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        Node current = head;
        Node previous = tail;

        do {
            if (current.task.getTaskId().equals(taskId)) {
                if (current == head) {
                    head = head.next;
                    tail.next = head; // Maintain circularity
                } else if (current == tail) {
                    tail = previous;
                    tail.next = head; // Maintain circularity
                } else {
                    previous.next = current.next;
                }
                size--;
                System.out.println("Task with ID '" + taskId + "' removed.");
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println("Task with ID '" + taskId + "' not found.");
    }

    // View the current task and move to the next task
    public Task viewCurrentAndMoveNext() {
        if (current == null) {
            current = head; // Start from the head if current is null
        } else {
            current = current.next; // Move to the next task
        }
        return current != null ? current.task : null;
    }

    // Display all tasks in the list starting from the head node
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.println(current.task);
            current = current.next;
        } while (current != head);
    }

    // Search for tasks by Priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        Node current = head;
        boolean found = false;
        do {
            if (current.task.getPriority() == priority) {
                System.out.println(current.task);
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No tasks found with priority " + priority + ".");
        }
    }
}