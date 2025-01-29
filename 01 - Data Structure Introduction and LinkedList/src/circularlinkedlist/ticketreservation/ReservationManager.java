package circularlinkedlist.ticketreservation;

/**
 * Provides a high-level interface for managing the ticket reservation system.
 */
public class ReservationManager {
    private TicketReservationSystem reservationSystem;

    // Constructor
    public ReservationManager() {
        reservationSystem = new TicketReservationSystem();
    }

    // Add a new ticket reservation
    public void addTicket(Ticket ticket) {
        reservationSystem.addTicket(ticket);
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(String ticketId) {
        reservationSystem.removeTicket(ticketId);
    }

    // Display all tickets
    public void displayTickets() {
        reservationSystem.displayTickets();
    }

    // Search for a ticket by Customer Name
    public void searchByCustomerName(String customerName) {
        reservationSystem.searchByCustomerName(customerName);
    }

    // Search for a ticket by Movie Name
    public void searchByMovieName(String movieName) {
        reservationSystem.searchByMovieName(movieName);
    }

    // Get the total number of booked tickets
    public int getTotalTickets() {
        return reservationSystem.getTotalTickets();
    }
}