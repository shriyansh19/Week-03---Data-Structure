package circularlinkedlist.taskscheduler;

/**
 * Provides a high-level interface for managing the task scheduler.
 */
public class TaskManager {
    private TaskScheduler scheduler;

    // Constructor
    public TaskManager() {
        scheduler = new TaskScheduler();
    }

    // Add a task at the beginning
    public void addTaskAtBeginning(Task task) {
        scheduler.addFirst(task);
    }

    // Add a task at the end
    public void addTaskAtEnd(Task task) {
        scheduler.addLast(task);
    }

    // Add a task at a specific position
    public void addTaskAtPosition(Task task, int position) {
        scheduler.addAtPosition(task, position);
    }

    // Remove a task by Task ID
    public void removeTaskById(String taskId) {
        scheduler.removeById(taskId);
    }

    // View the current task and move to the next task
    public void viewCurrentAndMoveNext() {
        Task currentTask = scheduler.viewCurrentAndMoveNext();
        if (currentTask != null) {
            System.out.println("Current Task: " + currentTask);
        } else {
            System.out.println("No tasks available.");
        }
    }

    // Display all tasks
    public void displayAllTasks() {
        scheduler.displayAllTasks();
    }

    // Search for tasks by Priority
    public void searchTasksByPriority(int priority) {
        scheduler.searchByPriority(priority);
    }
}