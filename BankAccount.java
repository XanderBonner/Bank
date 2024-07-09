package BankAccount;

public class BankAccount {

    //instance variable(s)
    private double balance;

    //Constructor(s)
    //new account, no balance (ie no @param)
    public BankAccount(){
        balance = 0;
    }
    //new account, starting with balance (ie @param)
    //@param is the inital balance we are constructing
    public BankAccount(double initialBalance){
        balance = initialBalance;
    }



    /*
     * Deposit an amount into the account balance.
     * @param amount is the amount to be deposited.
     * Mutator
     */
    public void deposit(double amount){
        balance = balance + amount;
    }

    /*
     * addInterest add's interst to the account balance.
     * @param rate is the interest rate we are adding to the account balance
     * Mutator 
     */
    public void addInterest(double rate){
        double amount = balance * rate / 100;
        balance = balance + amount;
    }

    /*
     * withdraw's an amount from the account. If amount is greater than balance then we need to charge.
     * @param amount that we wish to withdraw
     * Mutator
     */
    public void withdraw(double amount){
        final double PENALTY = 10;
        if(balance < amount){
            balance = balance - PENALTY;
        } else {
            balance = balance - amount;
        }
    }

    /*
     * returns the balance of the account.
     * Accessor
     */
    public double getBalance(){
        return balance;
    }

}
