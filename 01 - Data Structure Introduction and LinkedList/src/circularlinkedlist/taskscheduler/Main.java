package circularlinkedlist.taskscheduler;

/**
 * Main class to demonstrate the Task Scheduler functionality.
 */
public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        // Add tasks
        manager.addTaskAtBeginning(new Task("T001", "Complete Project", 1, "2023-10-15"));
        manager.addTaskAtEnd(new Task("T002", "Write Report", 2, "2023-10-20"));
        manager.addTaskAtPosition(new Task("T003", "Review Code", 3, "2023-10-18"), 1);

        // Display all tasks
        System.out.println("All Tasks:");
        manager.displayAllTasks();

        // View current task and move to the next task
        System.out.println("\nView Current and Move Next:");
        manager.viewCurrentAndMoveNext(); // Output: Current Task: T001
        manager.viewCurrentAndMoveNext(); // Output: Current Task: T003
        manager.viewCurrentAndMoveNext(); // Output: Current Task: T002

        // Search tasks by priority
        System.out.println("\nTasks with Priority 2:");
        manager.searchTasksByPriority(2); // Output: Task{taskId='T002', taskName='Write Report', priority=2, dueDate='2023-10-20'}

        // Remove a task
        manager.removeTaskById("T003");
        System.out.println("\nTasks after removal:");
        manager.displayAllTasks();
    }
}