package BankAccount;

public class BankAccountTester {

    public static void main(String[] args){
        System.out.println("****************** New Portfolio: With Initial Balance ******************");
        //create a new portfolio with initial
        Portfolio xPortfolio = new Portfolio(2000, 1000);
        
        //test deposit
        //  checking check
        System.out.println("************ Deposit check ************");
        xPortfolio.deposit(500, "C");
        System.out.println("Account Balance: $" + xPortfolio.getBalance("C"));
        System.out.println("Expected account balance is $2500.0");
        //  savings check
        xPortfolio.deposit(500, "S");
        System.out.println("Account Balance: $" + xPortfolio.getBalance("S"));
        System.out.println("Expected account balance is $1500.0");
        System.out.println();

        /*
         * Test Transfer from Checking to Savings
         */
        System.out.println("************ Transfer Check: Checking to Savings ************");
        xPortfolio.transfer(500, "C");
        System.out.println("Account Balance: $" + xPortfolio.getBalance("C"));
        System.out.println("Expected account balance is $2000.0");    
        System.out.println("Account Balance: $" + xPortfolio.getBalance("S"));
        System.out.println("Expected account balance is $2000.0");  
        System.out.println();
         
        /*
         * Test Transfer from Savings to Checking
         */
        System.out.println("************ Transfer Check: Savings to Checking ************");
        xPortfolio.transfer(1000, "S");
        System.out.println("Account Balance: $" + xPortfolio.getBalance("S"));
        System.out.println("Expected account balance is $1000.0");    
        System.out.println("Account Balance: $" + xPortfolio.getBalance("C"));
        System.out.println("Expected account balance is $3000.0");  
        System.out.println();
 
        /*
         * Test Withdraw from Checking
         */
        System.out.println("************ Transfer Withdraw: Checking ************");
        xPortfolio.withdraw(500,"C");
        System.out.println("Account Balance: $" + xPortfolio.getBalance("C"));
        System.out.println("Expected account balance is $2500.0");
        System.out.println();
        /*
         * Test Withdraw from Savings
         */
        System.out.println("************ Transfer Withdraw: Savings ************");
        xPortfolio.withdraw(500,"S");
        System.out.println("Account Balance: $" + xPortfolio.getBalance("S"));
        System.out.println("Expected account balance is $500.0");
        System.out.println();
        /*
         * Test Excess Withdraw
         */
        System.out.println("************ Transfer Withdraw: Checking ************");
        xPortfolio.withdraw(3000,"C");
        System.out.println("Account Balance: $" + xPortfolio.getBalance("C"));
        System.out.println("Expected account balance is $2490.0");
        System.out.println();
        /*
         * Test Withdraw from Savings
         */
        System.out.println("************ Transfer Withdraw: Savings ************");
        xPortfolio.withdraw(1000,"S");
        System.out.println("Account Balance: $" + xPortfolio.getBalance("S"));
        System.out.println("Expected account balance is $490.0");
        System.out.println();
        System.out.println();


        System.out.println("****************** New Portfolio: No Initial Balance ******************");
        //create a new portfolio with no initial
        Portfolio ePortfolio = new Portfolio();
        
        //test deposit
        //  checking check
        System.out.println("************ Deposit check ************");
        ePortfolio.deposit(2000, "C");
        System.out.println("Account Balance: $" + ePortfolio.getBalance("C"));
        System.out.println("Expected account balance is $2000.0");
        //  savings check
        ePortfolio.deposit(4000, "S");
        System.out.println("Account Balance: $" + ePortfolio.getBalance("S"));
        System.out.println("Expected account balance is $4000.0");
        System.out.println();

        /*
         * Test Transfer from Checking to Savings
         */
        System.out.println("************ Transfer Check: Checking to Savings ************");
        ePortfolio.transfer(500, "C");
        System.out.println("Account Balance: $" + ePortfolio.getBalance("C"));
        System.out.println("Expected account balance is $1500.0");    
        System.out.println("Account Balance: $" + ePortfolio.getBalance("S"));
        System.out.println("Expected account balance is $4500.0");  
        System.out.println();
         
        /*
         * Test Transfer from Savings to Checking
         */
        System.out.println("************ Transfer Check: Savings to Checking ************");
        ePortfolio.transfer(1000, "S");
        System.out.println("Account Balance: $" + ePortfolio.getBalance("S"));
        System.out.println("Expected account balance is $3500.0");    
        System.out.println("Account Balance: $" + ePortfolio.getBalance("C"));
        System.out.println("Expected account balance is $2500.0");  
        System.out.println();
 
        /*
         * Test Withdraw from Checking
         */
        System.out.println("************ Transfer Withdraw: Checking ************");
        ePortfolio.withdraw(500,"C");
        System.out.println("Account Balance: $" + ePortfolio.getBalance("C"));
        System.out.println("Expected account balance is $2000.0");
        System.out.println();
        /*
         * Test Withdraw from Savings
         */
        System.out.println("************ Transfer Withdraw: Savings ************");
        ePortfolio.withdraw(500,"S");
        System.out.println("Account Balance: $" + ePortfolio.getBalance("S"));
        System.out.println("Expected account balance is $3000.0");
        System.out.println();
        /*
         * Test Excess Withdraw
         */
        System.out.println("************ Transfer Withdraw: Checking ************");
        ePortfolio.withdraw(4000,"C");
        System.out.println("Account Balance: $" + ePortfolio.getBalance("C"));
        System.out.println("Expected account balance is $1990.0");
        System.out.println();
        /*
         * Test Withdraw from Savings
         */
        System.out.println("************ Transfer Withdraw: Savings ************");
        ePortfolio.withdraw(4000,"S");
        System.out.println("Account Balance: $" + ePortfolio.getBalance("S"));
        System.out.println("Expected account balance is $2990.0");
    }
}
