package singlylinkedlist.socialmedia;

import java.util.LinkedList;

// Class to represent a User
public class User {
    int userID;
    String name;
    int age;
    LinkedList<Integer> friendIDs; // List of friend IDs

    // Constructor to initialize user details
    public User(int userID, String name, int age) {
        this.userID = userID;
        this.name = name;
        this.age = age;
        this.friendIDs = new LinkedList<>();
    }

    // Method to display user details
    public void displayUser() {
        System.out.println("User ID: " + userID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Friends: " + friendIDs);
        System.out.println("-----------------------------");
    }
}