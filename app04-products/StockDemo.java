/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * Modified by Daniel Hale 10/11/2020
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        manager = new StockManager();
        manager.addProduct(new Product(101,  "Playstation 5"));
        manager.addProduct(new Product(102,  "Xbox Series X"));
        manager.addProduct(new Product(103,  "Google Stadia"));
        manager.addProduct(new Product(104,  "Nintendo Switch"));
        manager.addProduct(new Product(105,  "Apple iPhone X"));
        manager.addProduct(new Product(106,  "Samsung Galaxy S20"));
        manager.addProduct(new Product(107,  "Playstation 4 Pro"));
        manager.addProduct(new Product(108,  "Playstation 3 Slim"));
        manager.addProduct(new Product(109,  "Xbox 360 Elite"));
        manager.addProduct(new Product(110,  "Gamecube"));
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void demo()
    {
        // Show details of all of the products.
        manager.printProduct(101);
        
        // Take delivery of 5 items of one of the products.
        manager.delivery(101, 5);
        
        // Show the list of all products after delivery.
        manager.printProduct(101);
    }
    
    /**
     * Show details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void showDetails(int id)
    {
        Product product = getProduct(id);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Sell one of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int id)
    {
        Product product = getProduct(id);
        
        if(product != null) 
        {
            showDetails(id);
            product.sellOne();
            showDetails(id);
        }
    }
    
    /**
     * Get the product with the given id from the manager.
     * An error message is printed if there is no match.
     * @param id The ID of the product.
     * @return The Product, or null if no matching one is found.
     */
    public Product getProduct(int id)
    {
        Product product = manager.findProduct(id);
        
        if(product == null) 
        {
            System.out.println("Product with ID: " + id +
                               " is not recognised.");
        }
        return product;
    }

    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }
}
