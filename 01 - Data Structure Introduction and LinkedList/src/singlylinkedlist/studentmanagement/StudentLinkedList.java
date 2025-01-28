package singlylinkedlist.studentmanagement;

// Class to manage the singly linked list of students
public class StudentLinkedList {
    private Student head; // Head of the linked list

    // Constructor to initialize an empty list
    public StudentLinkedList() {
        this.head = null;
    }

    // Method to add a student at the beginning of the list
    public void addAtBeginning(int rollNumber, String name, int age, char grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        newStudent.next = head;
        head = newStudent;
        System.out.println("Student added at the beginning.");
    }

    // Method to add a student at the end of the list
    public void addAtEnd(int rollNumber, String name, int age, char grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (head == null) {
            head = newStudent;
        } else {
            Student current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newStudent;
        }
        System.out.println("Student added at the end.");
    }

    // Method to add a student at a specific position
    public void addAtPosition(int rollNumber, String name, int age, char grade, int position) {
        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }
        if (position == 1) {
            addAtBeginning(rollNumber, name, age, grade);
            return;
        }
        Student newStudent = new Student(rollNumber, name, age, grade);
        Student current = head;
        for (int i = 1; i < position - 1; i++) {
            if (current == null) {
                System.out.println("Position out of bounds.");
                return;
            }
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        newStudent.next = current.next;
        current.next = newStudent;
        System.out.println("Student added at position " + position + ".");
    }

    // Method to delete a student by roll number
    public void deleteByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.rollNumber == rollNumber) {
            head = head.next;
            System.out.println("Student with roll number " + rollNumber + " deleted.");
            return;
        }
        Student current = head;
        while (current.next != null && current.next.rollNumber != rollNumber) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Student with roll number " + rollNumber + " not found.");
            return;
        }
        current.next = current.next.next;
        System.out.println("Student with roll number " + rollNumber + " deleted.");
    }

    // Method to search for a student by roll number
    public void searchByRollNumber(int rollNumber) {
        Student current = head;
        while (current != null) {
            if (current.rollNumber == rollNumber) {
                System.out.println("Student found:");
                current.displayStudent();
                return;
            }
            current = current.next;
        }
        System.out.println("Student with roll number " + rollNumber + " not found.");
    }

    // Method to update a student's grade by roll number
    public void updateGrade(int rollNumber, char newGrade) {
        Student current = head;
        while (current != null) {
            if (current.rollNumber == rollNumber) {
                current.grade = newGrade;
                System.out.println("Grade updated for student with roll number " + rollNumber + ".");
                return;
            }
            current = current.next;
        }
        System.out.println("Student with roll number " + rollNumber + " not found.");
    }

    // Method to display all student records
    public void displayAllStudents() {
        if (head == null) {
            System.out.println("No students in the list.");
            return;
        }
        Student current = head;
        while (current != null) {
            current.displayStudent();
            current = current.next;
        }
    }
}