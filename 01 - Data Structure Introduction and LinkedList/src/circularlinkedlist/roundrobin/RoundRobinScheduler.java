package circularlinkedlist.roundrobin;

/**
 * Represents a circular linked list for managing processes in the round-robin scheduling algorithm.
 */
public class RoundRobinScheduler {
    // Node class for the circular linked list
    private static class Node {
        Process process;
        Node next;

        public Node(Process process) {
            this.process = process;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private Node current; // Points to the current process being executed
    private int timeQuantum;
    private int totalWaitingTime;
    private int totalTurnAroundTime;
    private int totalProcesses;

    // Constructor
    public RoundRobinScheduler(int timeQuantum) {
        this.head = null;
        this.tail = null;
        this.current = null;
        this.timeQuantum = timeQuantum;
        this.totalWaitingTime = 0;
        this.totalTurnAroundTime = 0;
        this.totalProcesses = 0;
    }

    // Add a new process at the end of the circular list
    public void addProcess(Process process) {
        Node newNode = new Node(process);
        if (head == null) {
            // If the list is empty
            head = tail = newNode;
            tail.next = head; // Make it circular
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Maintain circularity
        }
        totalProcesses++;
    }

    // Remove a process by Process ID after its execution
    public void removeProcess(String processId) {
        if (head == null) {
            System.out.println("No processes to remove.");
            return;
        }

        Node current = head;
        Node previous = tail;

        do {
            if (current.process.getProcessId().equals(processId)) {
                if (current == head) {
                    head = head.next;
                    tail.next = head; // Maintain circularity
                } else if (current == tail) {
                    tail = previous;
                    tail.next = head; // Maintain circularity
                } else {
                    previous.next = current.next;
                }
                totalProcesses--;
                System.out.println("Process with ID '" + processId + "' removed.");
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println("Process with ID '" + processId + "' not found.");
    }

    // Simulate the scheduling of processes in a round-robin manner
    public void simulateScheduling() {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int currentTime = 0;
        while (head != null) {
            current = head; // Start from the head
            System.out.println("\nCurrent Time: " + currentTime);
            displayProcesses();

            // Execute the current process for the time quantum or its remaining burst time
            int executionTime = Math.min(current.process.getBurstTime(), timeQuantum);
            current.process.setBurstTime(current.process.getBurstTime() - executionTime);
            currentTime += executionTime;

            // Update waiting and turn-around time
            if (current.process.getBurstTime() == 0) {
                totalTurnAroundTime += currentTime;
                totalWaitingTime += currentTime - executionTime;
                removeProcess(current.process.getProcessId()); // Remove the process after execution
            } else {
                head = head.next; // Move to the next process
            }
        }

        // Calculate and display average waiting and turn-around time
        System.out.println("\nScheduling completed.");
        System.out.println("Average Waiting Time: " + (double) totalWaitingTime / totalProcesses);
        System.out.println("Average Turn-Around Time: " + (double) totalTurnAroundTime / totalProcesses);
    }

    // Display the list of processes in the circular queue
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }

        Node current = head;
        do {
            System.out.println(current.process);
            current = current.next;
        } while (current != head);
    }
}