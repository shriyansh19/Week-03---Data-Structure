package sampleproblems.stacksandqueues.queueusingstack;

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        // Enqueue operations
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Dequeue operation
        System.out.println("Dequeued: " + queue.dequeue()); // Output: 1

        // Peek operation
        System.out.println("Front element: " + queue.peek()); // Output: 2

        // Enqueue more elements
        queue.enqueue(4);

        // Dequeue operations
        System.out.println("Dequeued: " + queue.dequeue()); // Output: 2
        System.out.println("Dequeued: " + queue.dequeue()); // Output: 3
        System.out.println("Dequeued: " + queue.dequeue()); // Output: 4

        // Check if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty()); // Output: true
    }
}