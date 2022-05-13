package project4;
import java.util.Scanner;
public class Inventory {
    Scanner input = new Scanner(System.in);
    private int itemNumber, quantity;
    private double cost, totalCost;
    
    //default constructor
    public Inventory()
    {
        itemNumber = 0;
        quantity = 0;
        cost = 0;
        totalCost = 0;
    }
    //constructor#2 that calls other class methods to copy into the appropriate member variables
    public Inventory(int itemNumber, int quantity, double cost)
    {
        setItemNumber(itemNumber);
        setQuantity(quantity);
        setCost(cost);
    }
   //sets Item Number while validating
    public void setItemNumber (int itemNumber)
    {
        while (ValidInt(itemNumber)) 
        {
        System.out.println("Item number must be 0 or greater. Please re-enter: ");
        itemNumber = input.nextInt();
        }
        this.itemNumber = itemNumber;
    }
    //sets Quantity while Validating
    public void setQuantity (int quantity)
    {
        while (ValidInt(quantity)) 
        {
        System.out.println("Quantity number must be 0 or greater. Please re-enter: ");
        quantity = input.nextInt();
        }
        this.quantity = quantity;
    }
    //sets cost while validating
    public void setCost (double cost)
    {
        while (ValidFloat(cost))
        {
        System.out.println("Cost number must be 0 or greater. Please re-enter: ");
        cost = input.nextDouble();
        }
        this.cost = cost;
    }
    //return Item number
    public int getItemNumber () 
    {
        return itemNumber;
    }
    //returns quantity
    public int getQuantity ()
    {
        return quantity;
    }
    //returns cost
    public double getCost ()
    {
        return cost;
    }
    //calculates and returns total cost
    public double getTotalCost ()
    {
       totalCost = cost * quantity;
       return totalCost;
    }
    //validates int input to be over 0 
    public Boolean ValidInt(int number)
    {
        if (number < 0) 
        return true;
        else 
        return false;
    }
    //validates double input to be over 0
    public Boolean ValidFloat(double number)
    {
        if (number < 0)
            return true;
        else
            return false;
    }
}