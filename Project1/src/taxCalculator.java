/*
 * Name: Johnny Pham
 * Date: August 31, 2021
 * Description: Calculator that calculates net salary of an employee given their name, salary, state of residence, and martial status
 */
import java.util.*;
import java.util.Scanner;
public class taxCalculator {

   
    
     public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
         double sal = 0; 
         double fedTax = 0;
         double stateTax = 0;
     //Number of employees though this number is practically useless
     System.out.println("Please enter the number of employees: ");
     int num = input.nextInt();
     
     //loop for each employee
     for (int i = 0; i < num; i++) {
         
     
     //Employee Name
     System.out.println("Please enter the employee's name: ");
     String name = input.next();
     
     //Employee Salary
     System.out.println("Please enter " +name +"'s salary in US dollars: ");
     sal = input.nextDouble();
     while (sal < 0)
     {
         System.out.println("The number you entered was negative therfore invalid, please enter a positive salary: ");
         sal = input.nextDouble();
     }
     
     //Martial Status
     System.out.println("What is " +name +"'s martial status(single/married): ");
     String status = input.next();
     status= status.toLowerCase();
 
     
     //State of residence
     System.out.println("What is the employee's state of residence: ");
     String state = input.next();
     state= state.toLowerCase();
     System.out.println(state);
     
     
    //Calculate Federal Tax(will go back later and attempt to use switch statements at later date)
     
     if (Objects.equals("single", status) && sal <=8000) {
         fedTax = sal * .1;
     }
     if (Objects.equals("single", status) && sal > 8000.00 && sal <=32000.00) {
         fedTax = (sal-8000.00) * .15 + 800;
     }
     if (Objects.equals("single", status) && sal > 32000.00) {
         fedTax = (sal - 32000.00) * .25 + 4400;
     }
     
     if (Objects.equals("married", status) && sal <= 16000.00) {
         fedTax = sal * .10;
     }
     if (Objects.equals("married", status) && sal > 16000.00 && sal <= 64000.00) {
         fedTax = (sal - 16000.00) * .15 +1600.00;
     }
     if (Objects.equals("married", status) && sal >64000.00) {
         fedTax = (sal - 64000.00) * .25 + 8800.00;
     }
     
     
    //Calculate State Tax
     
     if (Objects.equals("ca", state) || Objects.equals("nv", state) || Objects.equals("az", state) || Objects.equals("tx", state)) {
         stateTax = sal * .10000;
     }
     else {
         stateTax = sal * .12000;
     }
    
     double netSalary = sal - fedTax - stateTax;
     
    //Final output
     System.out.println(name + "'s Federal Tax: $" +fedTax);
     System.out.println(name + "'s State Tax: $" + stateTax);
     System.out.println(name + "'s Net Salary: $" + netSalary);
     }
     }
}

