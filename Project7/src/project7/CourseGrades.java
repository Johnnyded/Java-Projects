/*
 * Name: Johnny Pham
 * Date: 10/27/2021
 * Description: Class that handles overall grade given test scores
 */
package project7;

public class CourseGrades implements Analyzable{
    private final int NUM_GRADES = 4;
    //declare grades array
    private GradedActivity[] grades;
    
    //default constructor
    public CourseGrades()
    {
        grades = new GradedActivity[NUM_GRADES];
    }
    //setting first element of grades[] to lab grade
    //setters and getters
    public void setLab(GradedActivity labGrade)
    {
        grades[0] = labGrade;
    }
    
    public void setPassFailExam(PassFailExam passFailExamGrade)
    {
        grades[1] = passFailExamGrade;
    }
    
    public void setEssay(Essay essayGrade)
    {
        grades[2] = essayGrade;
    }
    
    public void setFinalExam(FinalExam finalExamGrades)
    {
        grades[3] = finalExamGrades;
    }
    //returns average of elements in grades array
    public double getAverage()
    {
        double total=0, average;
        for (int i = 0; i < grades.length; i++)
        {
            total += grades[i].getScore();
        }
        average = total/grades.length;
        return average;
    }
    //gets highest score in array
    public GradedActivity getHighest()
    {
        GradedActivity highest = grades[0];
        for (int i=0; i < grades.length; i++)
        {
            if (grades[i].getScore() > highest.getScore())
                highest = grades[i];
        }
        return highest;
    }
    //gets lowest score in array
    public GradedActivity getLowest()
    {
        GradedActivity lowest = grades[0];
        for (int i=0; i < grades.length; i++)
        {
            if (grades[i].getScore() < lowest.getScore())
                lowest = grades[i];
        }
        return lowest;
    }
    //toString() override
    @Override
    public String toString()
    {
        String str;
        str = "Lab Score: " + grades[0].getScore() + "\tGrade: " + grades[0].getGrade()
                + "\nPass/Fail Exam Score: " + grades[1].getScore() + "\tGrade: " + grades[1].getGrade()
                + "\nEssay Score: " + grades[2].getScore() + "\tGrade: " + grades[2].getGrade()
                + "\nFinal Exam Score: " + grades[3].getScore() + "\tGrade: " + grades[3].getGrade();
        return str;
    }
    

}
