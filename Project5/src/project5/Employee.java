/**
 * Name: Johnny Pham
 * Date: 10/16/2021
 * Description: base class for attributes and methods of and employee that will be inherited but ProductionWorker subclass
 */
package project5;
import java.util.Scanner;
public class Employee {
    private String name;
    private String employeeNumber;
    private String hireDate;
    Scanner input = new Scanner(System.in);
    //overloaded constructor for custom inputs
    public Employee(String name, String employeeNumber, String hireDate)
    {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;
    }
    //default constructor
    public Employee()
    {
        name = "John Smith";
        employeeNumber = "123-A";
        hireDate = "11-15-2005";
    }
    //sets the name to inputted
    public void setName(String name)
    {
        this.name=name;
    }
    //returns the name
    public String getName()
    {
        return name;
    }
    //sets employee number to inputted
    public void setEmployeeNumber(String num)
    {
 
        while(isValidEmpNum(num) == false)
        {
        System.out.println("Hey bud your employee number is invalid. The correct format is XXX-L\nX is must be a number(0-9)"
                + "\nL must be a letter from A-Z\nPlease enter it again");
        num = input.nextLine();
        }
        employeeNumber = num;
    }
    //returns employee number
    public String getEmployeeNumber()
    {
        return employeeNumber;
    }
    //sets hire date to inputted
    public void setHireDate(String hireDate)
    {
        this.hireDate = hireDate;
    }
    //returns hire date
    public String getHireDate()
    {
        return hireDate;
    }
    //validates employeeNumber arg and returns true if valid
    private Boolean isValidEmpNum(String employeeNumber)
    {
        boolean status = true;
        if (employeeNumber.length() != 5)
           status = false;
        else
        {
        
        if ((Character.isDigit(employeeNumber.charAt(0))) &&
        (Character.isDigit(employeeNumber.charAt(1))) &&
        (Character.isDigit(employeeNumber.charAt(2))) &&
        (employeeNumber.charAt(3) == '-') &&
        (Character.isLetter(employeeNumber.charAt(4))))
            status = true;
        }
        
    return status;
    }
    //override default toString() method to print what we want
    @Override
    public String toString()
    {
        String str = "Name:" + name +"\nEmployee Number: " 
    +employeeNumber +"\nHire Date: " +hireDate;
        return str;
    }
}
