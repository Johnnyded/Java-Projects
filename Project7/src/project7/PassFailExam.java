/*
 * Name: Johnny Pham
 * Date: 10/27/2021
 * Description: Class that handles the score of the Pass Fail Exam
 */
package project7;

public class PassFailExam extends PassFailActivity{
    private int numQuestions, numMissed;
    private double pointsEach;
    //overloaded constructor for object creation
    public PassFailExam(int numQuestions, int numMissed, double minPassingScore) 
    {
        super(minPassingScore);
        this.numMissed = numMissed;
        this.numQuestions = numQuestions;
        pointsEach = 100.0 / numQuestions;
        
        double tempScore = 100.0 - (numMissed  * pointsEach);
        setScore(tempScore);
    }
    
    
}
