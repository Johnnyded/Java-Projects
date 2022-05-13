/*
 * Name: Johnny Pham
 * Date: 12/03/2021
 * Description: Class for the the NormalAccountState
 */
package project11;

public class NormalAccountState extends AccountState {

    // Overloaded constructor
    public NormalAccountState(Account account){
        this.account = account;
    }

    // Copy constructor
    public NormalAccountState(AccountState state){
        this.account = state.account;
    }
    // Allows the customer to make a deposit
    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Now the balance is: $" + account.getBalance());
    }
    
    // Allows the customer to make a withdrawal
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
        System.out.println("Normal state, no interest applies!");
    }
    
    // Determines whether to make a deposit or withdrawal operation
    // according to the balance after each deposit and withdrawal operation
    @Override
    public void stateChangeCheck() {
        if(account.getBalance() <= 0)
            account.setState(new RestrictedAccountState(this));
        else if (account.getBalance() >= 20000)
            account.setState(new GoldAccountState(this));
    }
}
