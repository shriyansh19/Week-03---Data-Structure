package circularlinkedlist.ticketreservation;

/**
 * Main class to demonstrate the Online Ticket Reservation System.
 */
public class Main {
    public static void main(String[] args) {
        ReservationManager manager = new ReservationManager();

        // Add ticket reservations
        manager.addTicket(new Ticket("T001", "Roger", "Inception", 5, "10:00 AM"));
        manager.addTicket(new Ticket("T002", "Novak", "Interstellar", 10, "11:30 AM"));
        manager.addTicket(new Ticket("T003", "Marcus", "Pulp Fiction", 15, "12:00 PM"));

        // Display all tickets
        System.out.println("All Tickets:");
        manager.displayTickets();

        // Search for tickets by Customer Name
        System.out.println("\nTickets for Customer 'Roger':");
        manager.searchByCustomerName("Roger");

        // Search for tickets by Movie Name
        System.out.println("\nTickets for Movie 'Inception':");
        manager.searchByMovieName("Inception");

        // Remove a ticket
        manager.removeTicket("T002");
        System.out.println("\nTickets after removal:");
        manager.displayTickets();

        // Get the total number of booked tickets
        System.out.println("\nTotal Booked Tickets: " + manager.getTotalTickets());
    }
}