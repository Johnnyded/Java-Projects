package project6;
/*
 * Name Johnny Pham
 * Date: 10/12/21
 * Description: Child class of BankAccount that implements its own properties of a savings account
 */
public class SavingsAccount extends BankAccount{
    private boolean status;
    /*
     * checks if the account balance is under $25 in which case it will set the account status to false aka inactive
     */
    public void checkStatus()
    {
        if (balance > 25)
            status = true;
        else 
            status = false;
    }
    /*
     * overloaded constructor
     */
    public SavingsAccount(double balance, double interestRate, double monthlyServiceCharge)
    {
        super(balance, interestRate, monthlyServiceCharge);
    }
    
    /*
     * checks status of account and withdraws if account is still active
     */
    public void withdraw(double amount)
    {
        checkStatus();
        if (status == true)
            super.withdraw(amount);
        else if (status == false)
            System.out.println("Your account has only $" +String.format("%.2f", balance)  +" and does not meet the minimum requirement of $25\n"
                    + "and hence has been labeled as 'inactive'. Please get some money broke-boi.");
        
    }
    /*
     * checks status of account and deposits if account is still active. If account is inactive and deposit pushes it over 25,
     * then the account will resume being active
     */
    public void deposit(double amount)
    {
        checkStatus();
        if (amount + balance >25)
        {
            status = true;
        }
        if (status == true)
            super.deposit(amount);
         
        else if (status == false)
            System.out.println("Your account does not meet the minimum requirement of $25 before or after the deposit\n"
                    + "and hence has been labeled as 'inactive'. Please get some money broke-boi.");
    }
    /*
     * super of monthly process but also adds $1 to monthly service charge for every withdrawal over 4
     */
    public void monthlyProcess()
    {
        if (numWithdrawls > 4)
        {
            monthlyServiceCharge += (numWithdrawls - 4);
            checkStatus();
        }
        super.monthlyProcess();
    }
}
