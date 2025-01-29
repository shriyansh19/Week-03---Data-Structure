package singlylinkedlist.socialmedia;

// Class to manage the social media system
public class SocialMediaManager {
    private FriendList friendList;

    // Constructor to initialize the friend list
    public SocialMediaManager() {
        this.friendList = new FriendList();
    }

    // Method to add a user
    public void addUser(int userID, String name, int age) {
        User user = new User(userID, name, age);
        friendList.addUser(user);
    }

    // Method to add a friend connection
    public void addFriendConnection(int userID1, int userID2) {
        friendList.addFriendConnection(userID1, userID2);
    }

    // Method to remove a friend connection
    public void removeFriendConnection(int userID1, int userID2) {
        friendList.removeFriendConnection(userID1, userID2);
    }

    // Method to find mutual friends
    public void findMutualFriends(int userID1, int userID2) {
        friendList.findMutualFriends(userID1, userID2);
    }

    // Method to display all friends of a user
    public void displayFriends(int userID) {
        friendList.displayFriends(userID);
    }

    // Method to search for a user by User ID
    public void searchUserByID(int userID) {
        User user = friendList.findUserByID(userID);
        if (user != null) {
            System.out.println("User found:");
            user.displayUser();
        } else {
            System.out.println("User not found.");
        }
    }

    // Method to search for a user by Name
    public void searchUserByName(String name) {
        User user = friendList.findUserByName(name);
        if (user != null) {
            System.out.println("User found:");
            user.displayUser();
        } else {
            System.out.println("User not found.");
        }
    }

    // Method to count the number of friends for a user
    public void countFriends(int userID) {
        friendList.countFriends(userID);
    }
}