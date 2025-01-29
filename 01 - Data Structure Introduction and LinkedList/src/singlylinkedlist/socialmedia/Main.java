package singlylinkedlist.socialmedia;

public class Main {
    public static void main(String[] args) {
        SocialMediaManager manager = new SocialMediaManager();

        // Adding users
        manager.addUser(1, "Novak", 25);
        manager.addUser(2, "Bob", 30);
        manager.addUser(3, "Matthew", 22);
        manager.addUser(4, "David", 28);

        // Adding friend connections
        manager.addFriendConnection(1, 2);
        manager.addFriendConnection(1, 3);
        manager.addFriendConnection(2, 4);
        manager.addFriendConnection(3, 4);

        // Displaying friends of a user
        System.out.println("Displaying friends of Novak:");
        manager.displayFriends(1);

        // Finding mutual friends
        System.out.println("Finding mutual friends between Novak and David:");
        manager.findMutualFriends(1, 4);

        // Searching for a user by ID
        System.out.println("Searching for user with ID 3:");
        manager.searchUserByID(3);

        // Searching for a user by Name
        System.out.println("Searching for user with name 'Bob':");
        manager.searchUserByName("Bob");

        // Counting friends of a user
        System.out.println("Counting friends of Matthew:");
        manager.countFriends(3);

        // Removing a friend connection
        System.out.println("Removing friend connection between Novak and Bob:");
        manager.removeFriendConnection(1, 2);

        // Displaying friends of Novak after removal
        System.out.println("Displaying friends of Novak after removal:");
        manager.displayFriends(1);
    }
}