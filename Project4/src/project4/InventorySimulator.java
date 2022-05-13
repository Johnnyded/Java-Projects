/*
 * Name Johnny Pham
 * Date: 09/26/2021
 * Description: Tests inventory functions and classes by displaying the returns from the
 * the called functions. Also tests for user input validation.
 */
package project4;

import java.util.Scanner;
public class InventorySimulator {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Inventory myInventory = new Inventory();
        Inventory ourInventory = new Inventory(124, 12, 84.95);
        //default constructor demonstration
        System.out.println("Demonstrating default constructor...");
        System.out.printf("Item Number: %d\n" , myInventory.getItemNumber());
        System.out.printf("Quantity   : %d\n" , myInventory.getQuantity());
        System.out.printf("Cost       : $%.2f\n" , myInventory.getCost());
        System.out.printf("Total Cost : $%.2f\n\n" , myInventory.getTotalCost());
        
        //overloaded constructor demonstration
        System.out.println("Demonstrating overloaded constructor...");
        System.out.printf("Item Number: %d\n" , ourInventory.getItemNumber());
        System.out.printf("Quantity   : %d\n" , ourInventory.getQuantity());
        System.out.printf("Cost       : $%.2f\n" , ourInventory.getCost());
        System.out.printf("Total Cost : $%.2f\n\n" , ourInventory.getTotalCost());
        
        //set functions demonstration
        System.out.println("Demonstrating the set functions...");
        myInventory.setItemNumber(243);
        myInventory.setQuantity(50);
        myInventory.setCost(9.50);
        System.out.printf("Item Number: %d\n" , myInventory.getItemNumber());
        System.out.printf("Quantity   : %d\n" , myInventory.getQuantity());
        System.out.printf("Cost       : $%.2f\n" , myInventory.getCost());
        System.out.printf("Total Cost : $%.2f\n\n" , myInventory.getTotalCost());
        
        //input validation demonstration
        System.out.println("Demonstrating the input validation functions...");
        System.out.println("Enter the item number: ");
        myInventory.setItemNumber(input.nextInt());
        System.out.println(myInventory.getItemNumber() + "\n");
        
        System.out.println("Enter the quantity: ");
        myInventory.setQuantity(input.nextInt());
        System.out.println(myInventory.getQuantity() + "\n");
        
        System.out.println("Enter the cost: ");
        myInventory.setCost(input.nextDouble());
        System.out.println(myInventory.getCost() + "\n");
        //final display
        System.out.printf("Item Number: %d\n" , myInventory.getItemNumber());
        System.out.printf("Quantity   : %d\n" , myInventory.getQuantity());
        System.out.printf("Cost       : $%.2f\n" , myInventory.getCost());
        System.out.printf("Total Cost : $%.2f\n" , myInventory.getTotalCost());
    }

}
