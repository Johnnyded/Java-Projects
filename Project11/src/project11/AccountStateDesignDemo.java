/*
 * Name: Johnny Pham
 * Date: 12/03/2021
 * Description: Main Driver Class to demo
 */
package project11;

public class AccountStateDesignDemo {


    public static void main(String[] args) {
        Account account = new Account("Tom Zank", 0);
        account.deposit(3000);
        account.deposit(2000);
        account.deposit(5000);
        account.calculateInterest();
        account.withdraw(10000);
        account.withdraw(1100);
        account.withdraw(1100);
        account.deposit(20000);
        account.calculateInterest();
        account.deposit(1500);
    }
}
