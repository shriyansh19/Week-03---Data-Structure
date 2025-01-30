package sampleproblems.stacksandqueues.queueusingstack;

import java.util.Stack;

class MyQueue {
    private Stack<Integer> stack1; // Stack for enqueue operations
    private Stack<Integer> stack2; // Stack for dequeue operations

    // Constructor to initialize the stacks
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue operation: Add an element to the queue
    public void enqueue(int x) {
        stack1.push(x);
    }

    // Dequeue operation: Remove and return the front element of the queue
    public int dequeue() {
        // If stack2 is empty, transfer elements from stack1 to stack2
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        // If stack2 is still empty, the queue is empty
        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }

        // Return the top element of stack2
        return stack2.pop();
    }

    // Peek operation: Return the front element without removing it
    public int peek() {
        // If stack2 is empty, transfer elements from stack1 to stack2
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        // If stack2 is still empty, the queue is empty
        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }

        // Return the top element of stack2
        return stack2.peek();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}



