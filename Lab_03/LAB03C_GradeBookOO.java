import java.util.ArrayList;
public class LAB03C_GradeBookOO 
{
    private ArrayList<Double>  grade;

    public   LAB03C_GradeBookOO()
    {
        grade = new ArrayList<>();
    }

    public  LAB03C_GradeBookOO(ArrayList<Double> theInput)
    {
        grade = theInput;
    }

    public void addGrades(double theValue)
    {
        grade.add(theValue);
        System.out.println(theValue + " was added sucessfully.");
    }
    
    
    public void deleteGrade(double theGrade)
    {
        if(grade.contains(theGrade))
        {
            System.out.println(theGrade + " was removed sucessfully.");
        }

        else
        System.out.println("The specified grade doesn't exist.");
    }

    public void printGrades()
    {
        for(double val : grade)
        System.out.println(val);
    }
    
    public double averageGrade()
    {
        double sum = 0;
        int numberOFStudents = grade.size();

        for(double val: grade)
        {
            sum += val;
        }
        return sum/numberOFStudents;
    }
    
}

    