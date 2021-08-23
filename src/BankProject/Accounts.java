package BankProject;

public class Accounts {

    int accountNumber = 0;
    double balance = 0;
    String accountType;
    private static int lastUsedAccountNum = 0;

    /**
     * 1. openAccount
     *      Type (Savings, Checking)
     *      starting deposit
     *      user should get unique account number
     */
    public void openAccount(String newAccType, Double depositAmount) {
        lastUsedAccountNum = lastUsedAccountNum + 1;
        accountNumber = lastUsedAccountNum;
        accountType = newAccType;
        balance = depositAmount;
    }

    /**
     * 2. deposit
     *      account number
     *      amount
     */
    public void deposit(int acctNum, Double amount) {
        balance = balance + amount;
    }

    /**
     * 3. withdraw
     *      account number
     *      amount
     */
    public void withdraw(int acctNum, Double amount) {
        balance = balance - amount;
    }

    /**
     * 4. showBalance
     *      account number
     *      sout(balance)
     */
    public void showBalance(int acctNum) {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Balance $" + balance);
    }

}
