package BankAccount;

public class Portfolio {
    //Instance variables
    private BankAccount checking;
    private BankAccount savings;

    /*
     * Constructor(s)
     * first one is new with empty balance
     * second one is new but with initial balance
     */
    public Portfolio(){
        checking = new BankAccount();
        savings = new BankAccount();
    }

    public Portfolio(double initialCheckingBalance, double initialSavingBalance ){
        checking = new BankAccount(initialCheckingBalance);
        savings = new BankAccount(initialSavingBalance);
    }

    //moving on to methods

    /*
     * deposit a certian amount into either savings/checking account
     * calls bankaccount deposit to deposit the amount
     * @param double amount
     * Mutator
     */
     public void deposit(double amount, String account){
        if(account.equals("S")){
            savings.deposit(amount);
        } else if (account.equals("C")){
            checking.deposit(amount);
        } 
     }

     /*
      * transfer an amount from an account to the other account
      @param double amount is amount to transfer, String account is the account we will pulling from
      Mutator
      */
     public void transfer(double amount, String account){
            if(account.equals("C")){
                if(amount <= checking.getBalance()){
                    checking.withdraw(amount);
                    savings.deposit(amount);
                } 
            } else if (account.equals("S")){
                if(amount <= savings.getBalance()){
                    savings.withdraw(amount);
                    checking.deposit(amount);
                }
            }
     }

      /*
       * withdraw an amount from the listed account
       * @param double amount is the amount to withdraw, String Account is the account to pull from
       * Mutator
       * NOTE: we do not have to check if there is enough in account since this is done in the BankAccount class
       */
    public void withdraw(double amount, String account){
        if(account.equals("C")){
            checking.withdraw(amount);
        } else if(account.equals("S")){
            savings.withdraw(amount);
        }
    }

       /*
        * getBalance just returns a double amount for the balance in the account
        @param String Account to say what account we are grabbing from
        accessor
        */
    public double getBalance(String account){
        if(account.equals("C")){
            return checking.getBalance();
        } else if(account.equals("S")){
            return savings.getBalance();
        }
        return 0;
    }

}
