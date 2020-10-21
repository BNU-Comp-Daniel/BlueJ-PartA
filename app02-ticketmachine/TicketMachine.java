/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Modified by Daniel Hale 20/10/2020
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    
    private Ticket issuedTicket;
    
    private Ticket aylesburyTicket;
    
    private Ticket amershamTicket;
    
    private Ticket highwycombeTicket;

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
        
        aylesburyTicket = new Ticket("Aylesbury", 220);
        amershamTicket = new Ticket("Amersham", 300);
        highwycombeTicket = new Ticket("High Wycombe", 330);
    }

    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) 
        {
            balance = balance + amount;
        }
        else 
        {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        if(balance >= price) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
        }
    }
    
    /**
     * This will allow the customer to select a Aylesbury ticket with a 
     * fixed destination and price.
     */
    public void selectAyelsburyTicket()
    {
       issuedTicket = aylesburyTicket;   
    }
    
    /**
     * This will allow the customer to select a Amersham ticket with a 
     * fixed destination and price.
     */
    public void selectAmershamTicket()
    {
       issuedTicket = amershamTicket; 
    }

    /**
     * This will allow the customer to select a High Wycombe ticket with a 
     * fixed destination and price.
     */
    public void selectHighwycombeTicket()
    {
      issuedTicket = highwycombeTicket;  
    }
    
    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
    
    /**
     * This allows the customer to see all the available tickets.
     */
    public void printAllTickets()
    {
        System.out.println("The following three destinations are available");
        aylesburyTicket.print();
        amershamTicket.print();
        highwycombeTicket.print();
        System.out.println("Please select your ticket destination");
    }
    
    /**
     * This allows the customer to select the ticket.
     */
    public void selectTicket(String whereTo)
    {
        if(whereTo.startsWith("Ayl"))
        {
            issuedTicket = aylesburyTicket;
        }
        else if(whereTo.startsWith("Ame"))
        {
            
        }
        else if(whereTo.startsWith("Hig"))
        {
            
        }
        else
        {
            
        }
    }
}
