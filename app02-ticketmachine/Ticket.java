import java.util.Date;
/**
 * This class represents the ticket that is being purchased, it shall contain
 * the date, time, price and destination for that ticket.
 *
 * @author (Daniel Hale)
 * @version (18/10/2020)
 */
public class Ticket
{
    // Attributes
    
    private String destination;
    
    private int price;
    
    private Date issueDateTime;

    /**
     * This sets the destination and price of the ticket, the date and time
     * shall also match that of the current date and time on the system 
     * being used.
     */
    public Ticket(String destination, int price)
    {
        this.destination = destination;
        this.price = price;
        
        issueDateTime = new Date();
    }

    /**
     * This is the print method that will be used to print out the ticket.
     */
    public void print()
    {
        System.out.println(" Ticket " + destination + 
        " Price : " + price + 
        " Issued " + issueDateTime);
    }
}
