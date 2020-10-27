
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
    
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;

    /**
     * Constructor for objects of class Course
     * Contains the course title and the course code number.
     */
    public Course(String title, String codeNumber)
    {
       this.title = title;
       this.codeNumber = codeNumber;
       
       module1 = new Module("Programming Concepts", "CO452");
       module2 = new Module("Computer Architectures", "CO450");
       module3 = new Module("User Experience", "CO455");
       module4 = new Module("Web Development", "CO456");
    }
    
    public void addMark(int mark, int moduleNumber)
    {
       if(moduleNumber == 1)
       {
          module1.awardMark(mark); 
       }
       if(moduleNumber == 2)
       {
          module2.awardMark(mark); 
       }
       if(moduleNumber == 3)
       {
          module3.awardMark(mark); 
       }
       if(moduleNumber == 4)
       {
          module4.awardMark(mark); 
       }
    }
    
    /**
     *This will allow the course title and the course number to be printed. 
     */
    public void print()
    {
     System.out.println("Course: " + title + " " + codeNumber);
    }
}
