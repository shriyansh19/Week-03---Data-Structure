package circularlinkedlist.roundrobin;

/**
 * Represents a process with Process ID, Burst Time, and Priority.
 */
public class Process {
    private String processId;
    private int burstTime;
    private int priority;

    // Constructor
    public Process(String processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
    }

    // Getters
    public String getProcessId() {
        return processId;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public void setBurstTime(int burstTime) {
        this.burstTime = burstTime;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Process{" +
                "processId='" + processId + '\'' +
                ", burstTime=" + burstTime +
                ", priority=" + priority +
                '}';
    }
}