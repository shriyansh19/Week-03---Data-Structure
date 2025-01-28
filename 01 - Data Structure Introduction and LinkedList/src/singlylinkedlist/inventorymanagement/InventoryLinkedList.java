package singlylinkedlist.inventorymanagement;

// Class to manage the singly linked list of inventory items
public class InventoryLinkedList {
    private Item head; // Head of the linked list

    // Constructor to initialize an empty list
    public InventoryLinkedList() {
        this.head = null;
    }

    // Method to add an item at the beginning of the list
    public void addAtBeginning(String itemName, int itemID, int quantity, double price) {
        Item newItem = new Item(itemName, itemID, quantity, price);
        newItem.next = head;
        head = newItem;
        System.out.println("Item added at the beginning.");
    }

    // Method to add an item at the end of the list
    public void addAtEnd(String itemName, int itemID, int quantity, double price) {
        Item newItem = new Item(itemName, itemID, quantity, price);
        if (head == null) {
            head = newItem;
        } else {
            Item current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newItem;
        }
        System.out.println("Item added at the end.");
    }

    // Method to add an item at a specific position
    public void addAtPosition(String itemName, int itemID, int quantity, double price, int position) {
        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }
        if (position == 1) {
            addAtBeginning(itemName, itemID, quantity, price);
            return;
        }
        Item newItem = new Item(itemName, itemID, quantity, price);
        Item current = head;
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
        newItem.next = current.next;
        current.next = newItem;
        System.out.println("Item added at position " + position + ".");
    }

    // Method to remove an item by Item ID
    public void removeByItemID(int itemID) {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        if (head.itemID == itemID) {
            head = head.next;
            System.out.println("Item with ID " + itemID + " removed.");
            return;
        }
        Item current = head;
        while (current.next != null && current.next.itemID != itemID) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Item with ID " + itemID + " not found.");
            return;
        }
        current.next = current.next.next;
        System.out.println("Item with ID " + itemID + " removed.");
    }

    // Method to update the quantity of an item by Item ID
    public void updateQuantity(int itemID, int newQuantity) {
        Item current = head;
        while (current != null) {
            if (current.itemID == itemID) {
                current.quantity = newQuantity;
                System.out.println("Quantity updated for item with ID " + itemID + ".");
                return;
            }
            current = current.next;
        }
        System.out.println("Item with ID " + itemID + " not found.");
    }

    // Method to search for an item by Item ID
    public void searchByItemID(int itemID) {
        Item current = head;
        while (current != null) {
            if (current.itemID == itemID) {
                System.out.println("Item found:");
                current.displayItem();
                return;
            }
            current = current.next;
        }
        System.out.println("Item with ID " + itemID + " not found.");
    }

    // Method to search for an item by Item Name
    public void searchByItemName(String itemName) {
        Item current = head;
        while (current != null) {
            if (current.itemName.equalsIgnoreCase(itemName)) {
                System.out.println("Item found:");
                current.displayItem();
                return;
            }
            current = current.next;
        }
        System.out.println("Item with name " + itemName + " not found.");
    }

    // Method to calculate and display the total value of inventory
    public void calculateTotalValue() {
        double totalValue = 0;
        Item current = head;
        while (current != null) {
            totalValue += current.quantity * current.price;
            current = current.next;
        }
        System.out.println("Total inventory value: $" + totalValue);
    }

    // Method to sort the inventory by Item Name (ascending order)
    public void sortByItemName() {
        if (head == null || head.next == null) {
            return; // List is empty or has only one item
        }
        head = mergeSortByName(head);
        System.out.println("Inventory sorted by Item Name (ascending).");
    }

    // Helper method for merge sort by Item Name
    private Item mergeSortByName(Item head) {
        if (head == null || head.next == null) {
            return head;
        }
        Item middle = getMiddle(head);
        Item nextOfMiddle = middle.next;
        middle.next = null;

        Item left = mergeSortByName(head);
        Item right = mergeSortByName(nextOfMiddle);

        return mergeByName(left, right);
    }

    // Helper method to merge two sorted lists by Item Name
    private Item mergeByName(Item left, Item right) {
        Item result = null;
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        if (left.itemName.compareToIgnoreCase(right.itemName) <= 0) {
            result = left;
            result.next = mergeByName(left.next, right);
        } else {
            result = right;
            result.next = mergeByName(left, right.next);
        }
        return result;
    }

    // Method to sort the inventory by Price (ascending order)
    public void sortByPrice() {
        if (head == null || head.next == null) {
            return; // List is empty or has only one item
        }
        head = mergeSortByPrice(head);
        System.out.println("Inventory sorted by Price (ascending).");
    }

    // Helper method for merge sort by Price
    private Item mergeSortByPrice(Item head) {
        if (head == null || head.next == null) {
            return head;
        }
        Item middle = getMiddle(head);
        Item nextOfMiddle = middle.next;
        middle.next = null;

        Item left = mergeSortByPrice(head);
        Item right = mergeSortByPrice(nextOfMiddle);

        return mergeByPrice(left, right);
    }

    // Helper method to merge two sorted lists by Price
    private Item mergeByPrice(Item left, Item right) {
        Item result = null;
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        if (left.price <= right.price) {
            result = left;
            result.next = mergeByPrice(left.next, right);
        } else {
            result = right;
            result.next = mergeByPrice(left, right.next);
        }
        return result;
    }

    // Helper method to get the middle of the linked list
    private Item getMiddle(Item head) {
        if (head == null) {
            return head;
        }
        Item slow = head;
        Item fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Method to display all items in the inventory
    public void displayAllItems() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        Item current = head;
        while (current != null) {
            current.displayItem();
            current = current.next;
        }
    }
}