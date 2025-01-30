package sampleproblems.stacksandqueues.stockSpanner;

public class Main {
    public static void main(String[] args) {
        StockSpanner stockSpanner = new StockSpanner();

        // Test with some sample prices
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        System.out.println("Stock Spans:");
        for (int price : prices) {
            System.out.println("Price: " + price + ", Span: " + stockSpanner.next(price));
        }
    }
}
