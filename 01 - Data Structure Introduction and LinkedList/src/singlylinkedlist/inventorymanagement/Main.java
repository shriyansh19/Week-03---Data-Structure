package singlylinkedlist.inventorymanagement;

public class Main {
    public static void main(String[] args) {
        InventoryLinkedList inventory = new InventoryLinkedList();

        // Adding items
        inventory.addAtBeginning("Polar Smith", 101, 10, 1200.0);
        inventory.addAtEnd("Parle Jam In", 102, 50, 25.0);
        inventory.addAtPosition("Monaco", 103, 30, 50.0, 2);

        // Displaying all items
        System.out.println("All Items:");
        inventory.displayAllItems();

        // Searching for an item by ID
        System.out.println("Searching for item with ID 102:");
        inventory.searchByItemID(102);

        // Searching for an item by name
        System.out.println("Searching for item with name 'Keyboard':");
        inventory.searchByItemName("Keyboard");

        // Updating quantity of an item
        System.out.println("Updating quantity for item with ID 101:");
        inventory.updateQuantity(101, 15);

        // Displaying all items after update
        System.out.println("All Items after update:");
        inventory.displayAllItems();

        // Calculating total inventory value
        System.out.println("Calculating total inventory value:");
        inventory.calculateTotalValue();

        // Sorting inventory by Item Name
        System.out.println("Sorting inventory by Item Name:");
        inventory.sortByItemName();
        inventory.displayAllItems();

        // Sorting inventory by Price
        System.out.println("Sorting inventory by Price:");
        inventory.sortByPrice();
        inventory.displayAllItems();

        // Removing an item
        System.out.println("Removing item with ID 102:");
        inventory.removeByItemID(102);

        // Displaying all items after removal
        System.out.println("All Items after removal:");
        inventory.displayAllItems();
    }
}