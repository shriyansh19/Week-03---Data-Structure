package sampleproblems.stacksandqueues.sortstack;

import java.util.Stack;

class SortStack {
    // Function to sort a stack using recursion
    public static void sortStack(Stack<Integer> stack) {
        // Base case: If the stack has one or no elements, it's already sorted
        if (stack.isEmpty() || stack.size() == 1) {
            return;
        }

        // Step 1: Pop the top element
        int top = stack.pop();

        // Step 2: Sort the remaining stack recursively
        sortStack(stack);

        // Step 3: Insert the popped element back into the sorted stack
        insertSorted(stack, top);
    }

    // Helper function to insert an element into the sorted stack
    private static void insertSorted(Stack<Integer> stack, int element) {
        // Base case: If the stack is empty or the top of the stack is smaller, insert the element
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        // Step 1: Pop the top element
        int top = stack.pop();

        // Step 2: Insert the element into the sorted stack
        insertSorted(stack, element);

        // Step 3: Push the popped element back to the stack
        stack.push(top);
    }
}


