
/**
 * Write a description of class Course here.
 *
 * @author (Daniel Hale)
 * @version (27/10/2020)
 */
public class Course
{
   // Attributes/Variables/Fields
    private String title;
    
    private String codeNumber;

    /**
     * Constructor for objects of class Course
     * Contains the course title and the course code number.
     */
    public Course(String title, String codeNumber)
    {
       this.title = title;
       this.codeNumber = codeNumber;
    }
    
    /**
     *This will allow the course title and the course number to be printed. 
     */
    public void print()
    {
     System.out.println("Course: " + title + " " + codeNumber);
    }
}
