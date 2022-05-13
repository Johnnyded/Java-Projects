/*
 * Name: Johnny Pham
 * Date: 10/27/2021
 * Description: Class that handles the fields/components of an essay and grades them
 */
package project7;

public class Essay extends GradedActivity {
    private double grammar, spelling, correctLength, content;
    //setters and getters
    public void setScore(double grammar, double spelling, double correctLength, double content)
    {
        this.grammar = grammar;
        this.spelling = spelling;
        this.correctLength = correctLength;
        this.content = content;
    }

    public double getGrammar() {
        return grammar;
    }

    public void setGrammar(double grammar) {
        this.grammar = grammar;
    }

    public double getSpelling() {
        return spelling;
    }

    public void setSpelling(double spelling) {
        this.spelling = spelling;
    }

    public double getCorrectLength() {
        return correctLength;
    }

    public void setCorrectLength(double correctLength) {
        this.correctLength = correctLength;
    }

    public double getContent() {
        return content;
    }

    public void setContent(double content) {
        this.content = content;
    }
    
    public double getScore()
    {
        double score;
        score = grammar + spelling + correctLength + content;
        setScore(score);
        return score;
    }
    //toString() override
    @Override
    public String toString()
    {
        String str = "Term Paper: \n Grammar points: " + getGrammar() 
        +"\nSpelling Points: " +getSpelling() 
        +"\nLength Points: " +getCorrectLength()
        +"\nContent Points: " +getContent()
        +"Total Points: " +getScore()
        +"Grade: " +getGrade();

          return str; 
        
    }
}
