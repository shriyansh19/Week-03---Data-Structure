package singlylinkedlist.inventorymanagement;

// Class to represent an Item
public class Item {
    String itemName;
    int itemID;
    int quantity;
    double price;
    Item next; // Pointer to the next item in the linked list

    // Constructor to initialize item details
    public Item(String itemName, int itemID, int quantity, double price) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }

    // Method to display item details
    public void displayItem() {
        System.out.println("Item ID: " + itemID);
        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: $" + price);
        System.out.println("-----------------------------");
    }
}