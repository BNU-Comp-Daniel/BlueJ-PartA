
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Daniel Hale
 * @version 30/11/2020
 */
public class StockApp
{
    // Use to get user input
    private InputReader reader;
    
    private StockManager manager;
    
    private StockDemo oldStock;
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        reader = new InputReader();
        manager = new StockManager();
        oldStock = new StockDemo(manager);
    }

    /**
     * 
     */
    public void run()
    {
        getMenuChoice();
    }
    
    /**
     * 
     */
    public void getMenuChoice()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = reader.getInput();
            choice= choice.toLowerCase();
            
            if(choice.equals("quit"))
            {
                finished = true;
            }
            else
            {
                executeMenuChoice(choice);
            }
        }
    }
    
   private void executeMenuChoice(String choice)
   {
       if(choice.equals("add"))
       {
           addProduct();
       }
       else if(choice.equals("remove"))
       {
           removeProduct();
       }
       else if(choice.equals("printall"))
       {
           printAllProducts();
       }
   }
   
   /**
    * Method that adds products.
    */ 
   private void addProduct()
   {
       System.out.println("\nAdding a new product!\n");
       
       System.out.println("Please enter the product ID");
       String value = reader.getInput();
       int id = Integer.parseInt(value);
       
       System.out.println("Please enter the product name ");
       String name = reader.getInput();
       
       Product product = new Product(id, name);
       System.out.println("Added new product " + product);
       
       manager.addProduct(product);
   }
   
   /**
    * Method that removes products.
    */ 
   private void removeProduct()
   {
       
   }
   
   /**
    * Method that prints out all products.
    */ 
   private void printAllProducts()
   {
       manager.printAllProducts();
   }
   
   /**
      * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Daniel Hale");
        System.out.println("******************************");
    }
}
