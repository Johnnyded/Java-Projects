

/*
 * Name: Johnny Pham
 * Date: 09/12/2021
 * Description: A calculator that takes in x amount of students and 5 test scores for each and displays 
 * the scores along with their score averages after dropping the lowest and highest grade
 * P.S. I think it works...
 */
import java.util.Scanner;

public class studentScoresArray {
     static String[] studentNames;
     static int i, col, studentNumber;
     static Scanner input = new Scanner(System.in);
     static double[][] scoresAll ;
     


    //validate user input for scores
    static double validateUserInput(double score){
    	while( score < 0  || score >100)
    	{
    		System.out.println("Not valid! Please try again ");
            score = input.nextDouble();

    	
    	}
    	return score;	
    }
 //findLowest number given 2D array and row
static double findLowest(double [][] scores, int j) {
        double lowest = scores[j][0];
        for (int i = 0; i < 5; i++) 
        {
            if (scores[j][i] < lowest)
                lowest = scores[j][i];
        }
        return lowest;
    }
//findHighest number given 2D array and row
static double findHighest(double [][] scores, int j){
    double highest = scores[j][0];
    for (int i = 0; i < 5; i++) {
        if (scores[j][i] > highest)
            highest = scores[j][i];
    }
    return highest;
}

    //ask the user for student info including student name and 5 scores
     static void getStudentInfo() {
    	 double average;
    	  scoresAll = new double[studentNumber][5];
    	  studentNames = new String[studentNumber];
         input.nextLine();
        for (int i= 0; i < studentNumber; i++)
        {
        	 System.out.println("Please input the student name");
             studentNames[i] = input.nextLine();
            
          
         //Have user input scores
          System.out.println("Please input " +studentNames[i] +"'s scores(no commas)");
           for (int col=0; col < 5; col++) 
           {
               System.out.printf(" score%d : ", col+1);

               scoresAll[i][col] = input.nextDouble();

          
           //validates each input
        	   scoresAll[i][col]  = validateUserInput(scoresAll[i][col]);
     
           }
           
           input.nextLine();
         }
     

        input.close();
    }

   static double calcScore(double scoresAll[][], int i)
   {
       double sum = 0, average, min, max;
       for (int j =0 ; j < 5; j++ )
       {
    	   sum += scoresAll[i][j];
       }
       min = findLowest(scoresAll,i);
       max = findHighest(scoresAll,i);
       average = (sum - min -max)/3;
         return average;
       
   }
 
   //print function that calls calcScore and displays average and scores and table
   static void print()
   {
	   System.out.printf("StudentName\t| Exam1\t| Exam2\t|Exam3\t| Exam4\t| Exam5\t| Average\n");
		System.out.printf("====================================================================\n");

	    for (int i= 0; i < studentNumber; i++)
        {
		System.out.printf("%s:\t\t", studentNames[i]);
        	        
           for (int col=0; col < 5; col++) 
           {
               System.out.printf("%.2f\t  ", scoresAll[i][col]);
           }
           double average = calcScore(scoresAll, i);
           System.out.printf("%.2f\n", average);
        } 
   }
   
    public static void main(String[] args) {
        //ask for number of students
        System.out.print("Enter the number of Students : ");
        studentNumber = input.nextInt();
//finally, thanks professor, I really appreciate your willingness to help me late and deal with my lack of knowledge on the subject
     getStudentInfo();
     print();
    }

}
