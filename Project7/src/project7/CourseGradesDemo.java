/*
 * Name: Johnny Pham
 * Date: 10/27/2021
 * Description: Main Class that builds and displays grades and scores
 */
package project7;

public class CourseGradesDemo {

    public static void main(String[] args) {
        //testing
        Essay termPaper = new Essay();
        termPaper.setScore(25.0, 18.0, 20.0, 25.0);
        //termPaper.toPrint();
        GradedActivity lab = new GradedActivity();
        lab.setScore(85);
        PassFailExam PFexam = new PassFailExam(20, 3, 70);
        Essay essay = new Essay();
        essay.setScore(25, 18, 17, 20);
        FinalExam finalExam = new FinalExam(50, 10);
        CourseGrades courseGrades = new CourseGrades();
        courseGrades.setLab(lab);
        courseGrades.setPassFailExam(PFexam);
        courseGrades.setEssay(essay);
        courseGrades.setFinalExam(finalExam);
        
        System.out.println(courseGrades);
        double average = courseGrades.getAverage();
        System.out.println("Average Score: " + average);
        System.out.println("Lowest Score: " +courseGrades.getLowest().getScore());
        System.out.println("Highest Score: " +courseGrades.getHighest().getScore());

        
    }

}
