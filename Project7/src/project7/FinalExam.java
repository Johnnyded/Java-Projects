/*
 * Name: Johnny Pham
 * Date: 10/27/2021
 * Description: Class that handles Final Exam score
 */
package project7;

public class FinalExam extends GradedActivity{
    private int numQuestions, numMissed;
    private double pointsEach;
    
    //overloaded constructor for final exam
    public FinalExam(int numQuestions, int numMissed)
    {
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;
        pointsEach = 100 / numQuestions;
        double tempScore = 100.0 - (numMissed * pointsEach);
        setScore(tempScore);
    }
    //getters
    public double getPointsEach()
    {
        return pointsEach;
    }
    
    public int getNumMissed()
    {
        return numMissed;
    }
}
