package singlylinkedlist.studentmanagement;

// Class to represent a Student
public class Student {
    int rollNumber;
    String name;
    int age;
    char grade;
    Student next; // Pointer to the next student in the linked list

    // Constructor to initialize student details
    public Student(int rollNumber, String name, int age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }

    // Method to display student details
    public void displayStudent() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("-----------------------------");
    }
}