package circularlinkedlist.ticketreservation;

/**
 * Represents a ticket reservation with Ticket ID, Customer Name, Movie Name, Seat Number, and Booking Time.
 */
public class Ticket {
    private String ticketId;
    private String customerName;
    private String movieName;
    private int seatNumber;
    private String bookingTime;

    // Constructor
    public Ticket(String ticketId, String customerName, String movieName, int seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
    }

    // Getters
    public String getTicketId() {
        return ticketId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", movieName='" + movieName + '\'' +
                ", seatNumber=" + seatNumber +
                ", bookingTime='" + bookingTime + '\'' +
                '}';
    }
}