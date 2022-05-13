/*
 * Name: Johnny Pham
 * Date: 12/03/2021
 * Description: Class for the GoldAccountState
 */
package project11;

public class GoldAccountState extends AccountState {

    // Overloaded constructor
    public GoldAccountState(Account account){
        this.account = account;
    }

    // Copy constructor
    public GoldAccountState(AccountState state){
        this.account = state.account;
    }
    // Allows the customer to make a deposit
    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Now the balance is: $" + account.getBalance());
    }
    // Allows the customer to make a withdraw
    @Override
    public void withdraw(double amount) {
        if(account.getBalance() >= amount){
            account.setBalance(account.getBalance() - amount);
            if(account.getBalance() == 0)
                System.out.println("Limited operation!");
        }
        System.out.println("Your balance is now: $" + account.getBalance());
    }
    //calculate Interest
    @Override
    public void calculateInterest() {
        System.out.println("Gold account, interest amount will be applied!");
        double interest = Math.round(account.getBalance() * (0.01 / 12) * 100.0) / 100.0;
        System.out.println("interest amount: $" + interest);
        this.account.setBalance(account.getBalance() + interest);
        System.out.println(" balance after interest: $" + account.getBalance());
    }
    // Determines whether to make a deposit or withdrawal operation
    // according to the balance after each deposit and withdrawal operation
    @Override
    public void stateChangeCheck() {
        if(account.getBalance() < 20000 && account.getBalance() > 0)
            account.setState(new NormalAccountState(this));
        else if (account.getBalance() < 0)
            account.setState(new RestrictedAccountState(this));
    }
}
