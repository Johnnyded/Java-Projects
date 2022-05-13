/*
 * Name: Johnny Pham
 * Date: 12/03/2021
 * Description: AccountState abstract class for behavior standardization
 */
package project11;

public abstract class AccountState {

    // Class attributes
    protected Account account;


    // Allows the customer to make a deposit
    public abstract void deposit(double amount);

    // Allows the customer to make a withdrawal
    public abstract void withdraw(double amount);

    // Calculates interest amount
    public abstract void calculateInterest();

    // Determine whether to make a deposit or withdrawal operation
    // according to the balance after each deposit and withdrawal operation
    public abstract void stateChangeCheck();
}
