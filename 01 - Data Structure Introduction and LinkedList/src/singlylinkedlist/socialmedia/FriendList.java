package singlylinkedlist.socialmedia;
import java.util.LinkedList;
// Class to manage the singly linked list of users
public class FriendList {
    private UserNode head; // Head of the linked list

    // Inner class to represent a node in the linked list
    private static class UserNode {
        User user;
        UserNode next;

        UserNode(User user) {
            this.user = user;
            this.next = null;
        }
    }

    // Constructor to initialize an empty list
    public FriendList() {
        this.head = null;
    }

    // Method to add a user to the list
    public void addUser(User user) {
        UserNode newNode = new UserNode(user);
        if (head == null) {
            head = newNode;
        } else {
            UserNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("User added: " + user.name);
    }

    // Method to find a user by User ID
    public User findUserByID(int userID) {
        UserNode current = head;
        while (current != null) {
            if (current.user.userID == userID) {
                return current.user;
            }
            current = current.next;
        }
        return null;
    }

    // Method to find a user by Name
    public User findUserByName(String name) {
        UserNode current = head;
        while (current != null) {
            if (current.user.name.equalsIgnoreCase(name)) {
                return current.user;
            }
            current = current.next;
        }
        return null;
    }

    // Method to add a friend connection between two users
    public void addFriendConnection(int userID1, int userID2) {
        User user1 = findUserByID(userID1);
        User user2 = findUserByID(userID2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        if (!user1.friendIDs.contains(userID2)) {
            user1.friendIDs.add(userID2);
            user2.friendIDs.add(userID1);
            System.out.println("Friend connection added between " + user1.name + " and " + user2.name + ".");
        } else {
            System.out.println("Friend connection already exists.");
        }
    }

    // Method to remove a friend connection between two users
    public void removeFriendConnection(int userID1, int userID2) {
        User user1 = findUserByID(userID1);
        User user2 = findUserByID(userID2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        if (user1.friendIDs.contains(userID2)) {
            user1.friendIDs.remove((Integer) userID2);
            user2.friendIDs.remove((Integer) userID1);
            System.out.println("Friend connection removed between " + user1.name + " and " + user2.name + ".");
        } else {
            System.out.println("Friend connection does not exist.");
        }
    }

    // Method to find mutual friends between two users
    public void findMutualFriends(int userID1, int userID2) {
        User user1 = findUserByID(userID1);
        User user2 = findUserByID(userID2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        LinkedList<Integer> mutualFriends = new LinkedList<>();
        for (Integer friendID : user1.friendIDs) {
            if (user2.friendIDs.contains(friendID)) {
                mutualFriends.add(friendID);
            }
        }

        if (mutualFriends.isEmpty()) {
            System.out.println("No mutual friends found.");
        } else {
            System.out.println("Mutual friends between " + user1.name + " and " + user2.name + ":");
            for (Integer friendID : mutualFriends) {
                User friend = findUserByID(friendID);
                System.out.println(friend.name + " (ID: " + friend.userID + ")");
            }
        }
    }

    // Method to display all friends of a specific user
    public void displayFriends(int userID) {
        User user = findUserByID(userID);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Friends of " + user.name + ":");
        for (Integer friendID : user.friendIDs) {
            User friend = findUserByID(friendID);
            System.out.println(friend.name + " (ID: " + friend.userID + ")");
        }
    }

    // Method to count the number of friends for a specific user
    public void countFriends(int userID) {
        User user = findUserByID(userID);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println(user.name + " has " + user.friendIDs.size() + " friends.");
    }
}