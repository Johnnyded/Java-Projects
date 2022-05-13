/*
 * Name: Johnny Pham
 * Date: 09/19/2021
 * Description: Read in an external .txt file and process/write the individual and overall averages along with their letter grades in the form a chart onto a new .txt file
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class project3 {
    //arraylists to store information
    static ArrayList <String> studentNames = new ArrayList<String> ();
    static ArrayList <Double> studentScores = new ArrayList<Double> ();
    static ArrayList <String> letterGrades = new ArrayList<String> ();
    static ArrayList <String> letterGrade = new ArrayList<String> ();
    static Scanner input = new Scanner(System.in);
    static Scanner outputFileName = new Scanner(System.in);
    static Scanner inputFileName = new Scanner(System.in);
    static String tempIn, tempOut;
    
    static void readData() throws FileNotFoundException{
        //read in the names and store them in the ArrayList
       FileInputStream inputStream = new FileInputStream(tempIn);
       Scanner fileInput = new Scanner(inputStream);
       while(fileInput.hasNextLine()) 
       {
            String line[];
            line = fileInput.nextLine().split(" ",12);
            studentNames.add(line[0]);
            studentNames.add(line[1]);

            for (int i=0; i<10; i++)
            {
            double intValue = Double.parseDouble(line[i+2]);
            studentScores.add(intValue);
            
            }
        }
       fileInput.close();
    }
    
    //method to find the lowest score 
    static double findLowest(ArrayList<Double> studentScores, int k)
    {
        double lowArray[] = new double[10], lowest = 2; 
        
        for (int i = 0; i < 10; i++)
        {
            lowArray[i] = studentScores.get((k*10) + i);
        }
        Arrays.sort(lowArray);
        lowest = lowArray[0];
        return lowest;
    }
    
   //method to calculate the avg test scores and grades
    static double calcAvg(ArrayList<Double> studentScores, int k)
    {
        double sum = 0, average = 0, lowest = 0;
        
        for (int i = 0; i < 10; i++)
        {
            sum += studentScores.get((k*10) + i);
        }
        lowest = findLowest(studentScores, k);
        average = (sum - lowest)/9;
        
        if (average >= 98.00)
            letterGrade.add ("A+");
        if (average >= 95 && average < 98)
            letterGrade.add ("A");
        if (average >= 91 && average < 95)
            letterGrade.add ("A-");
        if (average >= 88 && average < 91)
            letterGrade.add ("B+");
        if (average >= 84 && average < 88)
            letterGrade.add ("B");
        if (average >= 80 && average < 84)
            letterGrade.add ("B-");
        if (average >= 75 && average < 80)
            letterGrade.add ("C+");
        if (average >= 70 && average < 75)
            letterGrade.add ("C");
        if (average > 60 && average < 70)
            letterGrade.add ("D");
        if (average <= 60)
            letterGrade.add ("NC");
        
        return average;
    }
    //method to calculate class average
    static double classAverage()
    {
        double sum = 0,classAvg = 0;
        for (int i=0; i < 14; i++)
        {
            sum += calcAvg(studentScores, i);
        }
        classAvg = sum/14;
        return classAvg;
    }
    //method to write the data to an output file
    static void writeData() throws FileNotFoundException
    {
        
        PrintWriter out = new PrintWriter(tempOut);
        //to actually print it in the console
//        System.out.printf("Student Name\t\t average\t Final Grade\n=====================================================\n");
//        for (int i=0; i < 14; i++)
//        {
//            String fullName = studentNames.get((2*i)+1) +" " +studentNames.get((2*i));
//            System.out.printf("%-25s %-24.2f %-21s\n", fullName, calcAvg(studentScores, i), letterGrade.get(i));
//        }
//        System.out.printf("=====================================================\n");
//        System.out.printf("Class Average: %16.2f", classAverage());
        
        out.printf("Student Name\t\t average\t Final Grade\n=====================================================\n");
        for (int i=0; i < 14; i++)
        {
            String fullName = studentNames.get((2*i)+1) +" " +studentNames.get((2*i));
            out.printf("%-25s %-24.2f %-21s\n", fullName, calcAvg(studentScores, i), letterGrade.get(i));
        }
        out.printf("=====================================================\n");
        out.printf("Class Average: %16.2f", classAverage());
        out.close();
        outputFileName.close();
    }
    public static void main(String[] args)throws FileNotFoundException{
        //reads in user inputted File Name
        while(true)
        try {
        System.out.print("Input File: ");
        tempIn = inputFileName.next();
        FileInputStream inputStream = new FileInputStream(tempIn);
        break;
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage() + " \nPlease try again");
        }
        
        System.out.print("Output File: ");
        tempOut = outputFileName.next();

        
            readData();
            writeData();

    }

}
































