/*
 * Name:Johnny Pham
 * Date: 10/16/2021
 * Description: Inherits the Employee class and adds shift and payrate and adds that to the toString
 */
package project5;

public class ProductionWorker extends Employee{
    private int shift;
    private double payRate;
    private String timeShift;
    public final int DAY_SHIFT=1, NIGHT_SHIFT=2;
    
    //overloaded constructor for custom input
    public ProductionWorker(String name, String EmployeeNumber, String hireDate, int shift, double payRate)
    {
        super(name, EmployeeNumber, hireDate);
        this.shift = shift;
        this.payRate = payRate;
    }
    //default constructor
    public ProductionWorker()
    {
        shift = 1;
        payRate = 16.50;
    }
    //sets shift value to inputted value
    public void setShift(int shift)
    {
        while((shift!=1) && (shift != 2))
        {
        System.out.println("Invalid Input -- Please enter 1 or 2: ");
        shift = input.nextInt();
        }
        this.shift = shift;
    }
    //returns the shift int value
    public int getShift()
    {
        return shift;
    }
    //sets pay rate given inputted value
    public void setPayRate(double payRate) 
    {
        this.payRate = payRate;
    }
    //returns double pay value
    public double getPayRate()
    {
        return payRate;
    }
    //overridden toString() using super to further concatenate
    @Override
    public String toString()
    {
        if (shift == 1)
        timeShift = "day";
        else
        timeShift = "night";
        
        String str = super.toString();
        str += "\nShift: " +timeShift +"\nHourly Pay Rate: $" +String.format("%.2f", payRate);
        return str;
    }
}
