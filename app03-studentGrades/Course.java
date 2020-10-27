
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
    
    private int finalMark;
       
    private Grades finalGrade;

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
    
    public Grades convertToGrade(int mark)
    {
        if((mark >= 0) && (mark < 39))
        {
            return Grades.F;
        }
        if((mark >= 40) && (mark < 49))
        {
            return Grades.D;
        }
        if((mark >= 50) && (mark < 59))
        {
            return Grades.C;
        }
        if((mark >= 60) && (mark < 69))
        {
            return Grades.B;
        }
        if((mark >= 70) && (mark < 100))
        {
            return Grades.A;
        }
        
        return Grades.X;
    }
    
    public void printAllModules()
    {
        System.out.println("Modules on Course");
        module1.print();
        module2.print();
        module3.print();
        module4.print();
    }
}
