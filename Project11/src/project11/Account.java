/*
 * Name: Johnny Pham
 * Date: 12/03/2021
 * Description: Class that handles the State of the account based on current circumstances
 */
package project11;

public class Account {

    // Class attributes
    private AccountState state;
    private String owner;
    private double balance;

    // Overloaded constructor
    public Account(String owner, double init){
        this.owner = owner;
        this.balance = init;
        System.out.println(owner + ": Open an account with an initial amount of " + init);
        System.out.println("--------------------------------------------");
        if(balance >= 20000)
            state = new GoldAccountState(this);
        else if (balance > 0)
            state = new NormalAccountState(this);
        else
            state = new RestrictedAccountState(this);
    }

    // Allows the customer to make a deposit
    public void deposit(double amount){
        System.out.println(owner + " deposited $" + amount);
        state.deposit(amount);
        stateChangeCheck();
    }

    // Allows the customer to make a withdrawal
    public void withdraw(double amount){
        System.out.println(owner + " withdraw money: $" + amount);
        state.withdraw(amount);
        stateChangeCheck();
    }
    
    //calculate Interest
    public void calculateInterest(){
        state.calculateInterest();
    }

    // Determines whether to make a deposit or withdrawal operation
    // according to the balance after each deposit and withdrawal operation
    public void stateChangeCheck(){
        state.stateChangeCheck();
        System.out.println("The account status is now: " + state.getClass().getSimpleName());
        System.out.println("--------------------------------------------");
    }

    // Getter for balance attribute
    public double getBalance() {
        return balance;
    }

    // Setter for balance attribute
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Setter for account state attribute
    public void setState(AccountState state) {
        this.state = state;
    }
}
