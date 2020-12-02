
/**
 * Write a description of class Menu here.
 *
 * @author (Daniel Hale)
 * @version (30/11/2020)
 */
public class Menu
{
    private static InputReader reader = new InputReader();
    
    /**
     * Display all of the choices.
     */
    public static String getMenuChoice(String [] choices)
    {
        boolean finished = false;
        String choice = null;
        
        while(!finished)
        {
             printChoices(choices);
             
             choice = reader.getInput();
             choice = choice.toLowerCase();
             
             finished = checkInvalid(choices, choice);
             if(!finished)
             {
                 System.out.println(" Not a valid choice!");
             }
        }
        
        return choice;
    }
    
    private static boolean checkInvalid(String [] choices, String choice)
    {
        for(String validChoice : choices)
        {
            validChoice = validChoice.toLowerCase();
            
            if(validChoice.startsWith(choice))
            return true;
        }
        return false;
    }
    
    private static void printChoices(String [] choices)
    {
        System.out.println(" Enter the first word, your choices are: \n");
        
        for(String choice: choices)
        {
            System.out.println("    " + choice);
        }
    }
}
