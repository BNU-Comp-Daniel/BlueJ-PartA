
/**
 * Write a description of class Module here.
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
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNumber)
    {
      mark = 0;
      this.title = title;
      this.codeNumber = codeNumber;
    }
    
    public void print()
    {
        System.out.println("Module: " + codeNumber + 
        "" + title + " Mark = " + mark);
    }

}