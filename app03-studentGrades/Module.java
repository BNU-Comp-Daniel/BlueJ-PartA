;
/**
 * This class contains the details of the modules.
 *
 * @author (Daniel Hale)
 * @version (27/10/2020)
 */
public class Module
{
    private String title;
    
    private String codeNumber;
    
    private int mark;
    
    /**
     * This allows the modules to have a title and a code.
     */
    public Module(String title, String codeNumber)
    {
      mark = 0;
      this.title = title;
      this.codeNumber = codeNumber;
    }
    
    /**
     * This allows the system to give out an invalid mark if it the mark
     * doesn't stay within the boundaries.
     */
    public void awardMark(int mark)
    {
        if((mark >= 0) && (mark <= 100))
        {
        this.mark = mark;
    }
    else
    {
       System.out.print("Invalid mark!"); 
    }
    }
    
    /**
     * This allows the system to print out the module's details including
     * mark.
     */
    public void print()
    {
        System.out.println("Module: " + codeNumber + 
        "" + title + " Mark = " + mark);
    }

}
