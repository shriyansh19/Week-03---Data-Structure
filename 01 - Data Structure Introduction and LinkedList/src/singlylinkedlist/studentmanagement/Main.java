package singlylinkedlist.studentmanagement;

public class Main {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        // Adding students
        list.addAtBeginning(101, "Steve Rogers", 20, 'A');
        list.addAtEnd(102, "Bruce Wayne", 21, 'B');
        list.addAtPosition(103, "Clark Kent", 22, 'C', 2);

        // Displaying all students
        System.out.println("All Students:");
        list.displayAllStudents();

        // Searching for a student
        System.out.println("Searching for student with roll number 102:");
        list.searchByRollNumber(102);

        // Updating a student's grade
        System.out.println("Updating grade for student with roll number 101:");
        list.updateGrade(101, 'A');

        // Displaying all students after update
        System.out.println("All Students after update:");
        list.displayAllStudents();

        // Deleting a student
        System.out.println("Deleting student with roll number 102:");
        list.deleteByRollNumber(102);

        // Displaying all students after deletion
        System.out.println("All Students after deletion:");
        list.displayAllStudents();
    }
}