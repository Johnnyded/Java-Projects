/*
 * Name: Johnny Pham
 * Date: 10/27/2021
 * Description: Pass and Fail Frame class
 */
package project7;

public class PassFailActivity extends GradedActivity{
    private double minPassingScore;
    //overloaded constructor
    public PassFailActivity(double minPassingScore)
    {
        this.minPassingScore = minPassingScore;
    }
    
    public char getGrade()
    {
        if (super.getScore() >= minPassingScore)            
           return 'P';
       else 
           return 'F';
    }
}
