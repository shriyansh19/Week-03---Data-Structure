package circularlinkedlist.roundrobin;

/**
 * Main class to demonstrate the Round Robin Scheduling Algorithm.
 */
public class Main {
    public static void main(String[] args) {
        // Create a scheduler with a time quantum of 4
        SchedulerManager manager = new SchedulerManager(4);

        // Add processes
        manager.addProcess(new Process("P1", 10, 1));
        manager.addProcess(new Process("P2", 5, 2));
        manager.addProcess(new Process("P3", 8, 3));

        // Display all processes
        System.out.println("Initial Processes:");
        manager.displayProcesses();

        // Simulate scheduling
        System.out.println("\nStarting Round Robin Scheduling Simulation:");
        manager.simulateScheduling();
    }
}