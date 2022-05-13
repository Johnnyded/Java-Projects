/*
 * Name: Johnny Pham
 * Date: 10/12/21
 * Description: Main class that displays bank information and utilizes the other 2 classes
 */
package project6;
import java.util.Scanner;
public class SavingsDemo {

    public static void main(String[] args) {
        String answer;
        Scanner input = new Scanner(System.in);
        BankAccount mySavings = new SavingsAccount(100.0, .03, 2.5);
        /*
         * initial  overloaded constructor display
         */
        System.out.printf("Balance: $%.2f", mySavings.getBalance());
        System.out.printf("\nNumber of Deposits: %d", mySavings.getNumDeposits());
        System.out.printf("\nNumber of Withdrawls: %d", mySavings.getNumWithdrawls());
        
        /*
         * deposit loop that keeps going until user says no
         */
        while (true)
        {
        System.out.println("\n\nPlease enter the amount you want to deposit: ");
        mySavings.deposit(input.nextDouble());
        System.out.println("Do you want to make another deposit?(yes/no): ");
        answer = input.next().toLowerCase();
            if (answer.equals("no"))
            {
                break;
            }
        }
       /*
        * progress display
        */
        System.out.println("\nProgress so far: ");
        System.out.printf("Balance: $%.2f", mySavings.getBalance());
        System.out.println("\nNumber of Deposits: " + mySavings.getNumDeposits());
        System.out.println("Number of Withdrawls: " + mySavings.getNumWithdrawls());
        /*
         * withdrawal loop that keeps going until user says no
         */
        while (true)
        {
            System.out.println("\nHow much do you want to withdraw?: ");
            mySavings.withdraw(input.nextDouble());
            System.out.println("Do you want to make another withdrawl?(yes/no): ");
            answer = input.next().toLowerCase();
            if (answer.equals("no"))
            {
                break;
            }
        }
        
        /*
         * final progress display and post-monthly process display
         */
        System.out.println("\nProgress so far: ");
        System.out.printf("Balance: $%.2f", mySavings.getBalance());
        System.out.println("\nNumber of Deposits: " + mySavings.getNumDeposits());
        System.out.println("Number of Withdrawls: " + mySavings.getNumWithdrawls());
        
        System.out.println("\nDoing the monthly processing");
        mySavings.monthlyProcess();
        System.out.printf("Balance: $%.2f", mySavings.getBalance());
        System.out.println("\nNumber of Deposits: " + mySavings.getNumDeposits());
        System.out.println("Number of Withdrawls: " + mySavings.getNumWithdrawls());

        input.close();
    }

}
