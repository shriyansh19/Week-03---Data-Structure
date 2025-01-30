package sampleproblems.stacksandqueues.circulartour;

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        // Petrol at each pump
        int[] petrol = {4, 6, 7, 4};
        // Distance to the next pump
        int[] distance = {6, 5, 3, 5};

        int start = CircularTour.findStartingPump(petrol, distance);

        if (start != -1) {
            System.out.println("The starting petrol pump is: " + start);
        } else {
            System.out.println("It is not possible to complete the circular tour.");
        }
    }
}
