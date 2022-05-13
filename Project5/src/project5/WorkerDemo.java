/*
 * Name:Johnny Pham
 * Date: 10/16/2021
 * Description: Holds Main function and acts as user interface with prompts and calling the relevant functions to display the worker info
 */
package project5;
import java.util.Scanner;
public class WorkerDemo {
    //main function
    public static void main(String[] args)throws Exception{
       Scanner input = new Scanner(System.in);
       ProductionWorker defWorker = new ProductionWorker();
       ProductionWorker myWorker = new ProductionWorker("name", "employeeNumber", "date", 1, 12.0);
       
       //use toString() to print out default constructor
       System.out.println("Here's the first production worker:");
       System.out.println(defWorker.toString());
       //Beginning of the user input validation demo
       System.out.println("\nDemonstrating the input validation...\n");
       
       System.out.println("Enter the Employee Name:");
       myWorker.setName(input.nextLine());
       System.out.println("Enter the Employee Number:");
       myWorker.setEmployeeNumber(input.nextLine());
       System.out.println("Enter the Employee hire date(MM-DD-YYYY):");
       myWorker.setHireDate(input.nextLine());
       System.out.println("\nEnter the Employee shift(Day = 1, Night =2)");
       myWorker.setShift(input.nextInt());
       System.out.println("\nEnter the Employee pay rate:");
       myWorker.setPayRate(input.nextDouble());
       System.out.println("\nHere's the second production worker:");
       System.out.println(myWorker.toString());


    }
   
}
