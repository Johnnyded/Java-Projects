package project6;
/*
 * Name Johnny Pham
 * Date: 10/12/21
 * Description: Parent abstract class that holds setters and getters as well as default and overloaded constructors for basic 
 * bank account functions
 */
public abstract class BankAccount {
   double balance, interestRate, monthlyServiceCharge;
   int numDeposits, numWithdrawls;
   /*
    * default constructor that sets all variables to 0
    */
   public BankAccount()
   {
       balance = 0;
       interestRate = 0;
       monthlyServiceCharge = 0;
       numDeposits = 0;
       numWithdrawls = 0;
   }
   /*
    * overloaded constructor so we can set the variables when we create an object of it
    */
   public BankAccount(double balance, double interestRate, double monthlyServiceCharge)
   {
       this.balance = balance;
       this.interestRate = interestRate;
       this.monthlyServiceCharge = monthlyServiceCharge;
   }
   /*
    * takes in amount:double and adds it to balance while incrementing number of deposits variable
    */
   public void deposit(double amount)
   {
       balance += amount;
       numDeposits++;
   }
   /*
    * takes in amount:double and subtracts it from balance while incrementing number of withdrawls variable
    */
   public void withdraw(double amount) 
   {
       balance -= amount;
       numWithdrawls++;
   }
   /*
    * calculates balance after monthly interest rate is added
    */
   private void calcInterest() 
   {
       balance += (interestRate/12)*balance;
   }
   /*
    * setter for monthly service charge
    */
   public void setMonthlyServiceCharges(double amount)
   {
       monthlyServiceCharge = amount;
   }
   /*
    * subtracts monthly service charge fee from balance then calculates and adds monthly interest to remaining balance
    * Also resets tracker variables
    */
   public void monthlyProcess()
   {
       balance -= monthlyServiceCharge;
       calcInterest();
       numWithdrawls = 0;
       numDeposits = 0;
       monthlyServiceCharge = 0;
       
   }
   /*
    * getter for balance
    */
   public double getBalance()
   {
       return balance;
   }
   /*
    * getter for number of deposits
    */
   public int getNumDeposits()
   {
       return numDeposits;
   }
   /*
    * getter for number of withdrawls
    */
   public int getNumWithdrawls()
   {
       return numWithdrawls;
   }
   /*
    * getter for annual interest rate
    */ 
   public double getInterestRate()
   {
       return interestRate;
   }
   /*
    * getter for monthly service charges
    */
   public double getMonthlyServiceCharges()
   {
       return monthlyServiceCharge;
   }
}
