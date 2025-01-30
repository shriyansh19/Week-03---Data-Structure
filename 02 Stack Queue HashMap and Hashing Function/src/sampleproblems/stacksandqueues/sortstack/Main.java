package sampleproblems.stacksandqueues.sortstack;

import java.util.Stack;

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(5);

        System.out.println("Original stack: " + stack);

        // Sort the stack
        SortStack.sortStack(stack);

        System.out.println("Sorted stack: " + stack);
    }
}
