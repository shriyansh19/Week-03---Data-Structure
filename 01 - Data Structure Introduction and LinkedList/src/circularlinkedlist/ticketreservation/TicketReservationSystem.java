package circularlinkedlist.ticketreservation;

/**
 * Represents a circular linked list for managing ticket reservations.
 */
public class TicketReservationSystem {
    // Node class for the circular linked list
    private static class Node {
        Ticket ticket;
        Node next;

        public Node(Ticket ticket) {
            this.ticket = ticket;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // Constructor
    public TicketReservationSystem() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Add a new ticket reservation at the end of the circular list
    public void addTicket(Ticket ticket) {
        Node newNode = new Node(ticket);
        if (head == null) {
            // If the list is empty
            head = tail = newNode;
            tail.next = head; // Make it circular
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Maintain circularity
        }
        size++;
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(String ticketId) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        Node current = head;
        Node previous = tail;

        do {
            if (current.ticket.getTicketId().equals(ticketId)) {
                if (current == head) {
                    head = head.next;
                    tail.next = head; // Maintain circularity
                } else if (current == tail) {
                    tail = previous;
                    tail.next = head; // Maintain circularity
                } else {
                    previous.next = current.next;
                }
                size--;
                System.out.println("Ticket with ID '" + ticketId + "' removed.");
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println("Ticket with ID '" + ticketId + "' not found.");
    }

    // Display all tickets in the circular list
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        Node current = head;
        do {
            System.out.println(current.ticket);
            current = current.next;
        } while (current != head);
    }

    // Search for a ticket by Customer Name
    public void searchByCustomerName(String customerName) {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        Node current = head;
        boolean found = false;
        do {
            if (current.ticket.getCustomerName().equalsIgnoreCase(customerName)) {
                System.out.println(current.ticket);
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No tickets found for customer '" + customerName + "'.");
        }
    }

    // Search for a ticket by Movie Name
    public void searchByMovieName(String movieName) {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        Node current = head;
        boolean found = false;
        do {
            if (current.ticket.getMovieName().equalsIgnoreCase(movieName)) {
                System.out.println(current.ticket);
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No tickets found for movie '" + movieName + "'.");
        }
    }

    // Calculate the total number of booked tickets
    public int getTotalTickets() {
        return size;
    }
}