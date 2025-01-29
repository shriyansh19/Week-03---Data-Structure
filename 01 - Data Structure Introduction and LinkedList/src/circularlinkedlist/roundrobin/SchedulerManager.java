package circularlinkedlist.roundrobin;

/**
 * Provides a high-level interface for managing the round-robin scheduler.
 */
public class SchedulerManager {
    private RoundRobinScheduler scheduler;

    // Constructor
    public SchedulerManager(int timeQuantum) {
        scheduler = new RoundRobinScheduler(timeQuantum);
    }

    // Add a new process
    public void addProcess(Process process) {
        scheduler.addProcess(process);
    }

    // Remove a process by Process ID
    public void removeProcess(String processId) {
        scheduler.removeProcess(processId);
    }

    // Simulate the scheduling of processes
    public void simulateScheduling() {
        scheduler.simulateScheduling();
    }

    // Display all processes
    public void displayProcesses() {
        scheduler.displayProcesses();
    }
}