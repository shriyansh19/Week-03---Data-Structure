package sampleproblems.stacksandqueues.stockSpanner;

import java.util.Stack;

class StockSpanner {
    // Stack to hold pairs of price and span
    private Stack<Pair> stack;

    // Constructor
    public StockSpanner() {
        stack = new Stack<>();
    }

    // Method to calculate the stock span
    public int next(int price) {
        int span = 1;

        // While stack is not empty and the top price is less than or equal to the current price
        while (!stack.isEmpty() && stack.peek().price <= price) {
            span += stack.peek().span; // Add the span of the top element
            stack.pop(); // Remove the top element
        }

        // Push the current price and its span to the stack
        stack.push(new Pair(price, span));

        return span;
    }

    // Custom Pair class
    private static class Pair {
        int price;
        int span;

        Pair(int price, int span) {
            this.price = price;
            this.span = span;
        }
    }
}




