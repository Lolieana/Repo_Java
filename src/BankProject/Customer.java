package BankProject;

public class Customer {

    /**
     * Every Customer can have maximum 5 bank account with Bank.
     */
    private Accounts[] custAccounts = new Accounts[5];
    private String name = "";
    private String ssn = "";
    private String phone = "";
    private String cityName = "";
    private int numAccounts = 0;

    /**
     * 1. createProfile
     *      name
     *      ssn
     *      phone
     *      cityName (optional)
     */
    public void createProfile(String newName, String newSSN, String newPhone, String newCityName) {
        name = newName;
        ssn = newSSN;
        phone = newPhone;
        cityName = newCityName;
    }

    public void createProfile(String newName, String newSSN, String newPhone) {
        name = newName;
        ssn = newSSN;
        phone = newPhone;
    }

    /**
     * 2. updateProfile()
     *      customer should send fieldName and newValue
     */
    public void updateProfile(String fieldName, String newValue) {

        fieldName = fieldName.toLowerCase();

        switch (fieldName) {
            case "name":
                name = newValue;
                break;
            case "cityname":
                cityName = newValue;
            case "ssn":
                ssn = newValue;
                break;
            case "phone":
                phone = newValue;
            default:
                System.out.println("** Error - The field name: " + fieldName + " does not exist.");
        }

    }

        /**
         * 3. showProfile
         *      Name:
         *      Phone number:
         *      (if provided) CityName:
         *      Total number of Accounts:
         */
        public void showProfile() {
            System.out.println("\nName: " + name);
            System.out.println("Phone Number: " + phone);
            if (cityName.length() > 0) {
                System.out.println("City Name: " + cityName);
            }
            System.out.println("Total number of Accounts: " + numAccounts);
        }

    /**
     * openAnAccount
     *      pls use openAccount method from Accounts class
     */
    public void openAnAccount(String accountType, double startingBalance) {
        Accounts accounts = new Accounts();
        accounts.openAccount(accountType, startingBalance);
        custAccounts[numAccounts] = accounts;
        numAccounts = numAccounts + 1;
    }

    /**
     * makeDeposit
     *      pls use deposit method from Accounts class
     */
    public void makeDeposit(int acctNumber, double amount) {
        for (int i=0; i < numAccounts; i++) {
            if (custAccounts[i].accountNumber == acctNumber) {
                custAccounts[i].deposit(acctNumber, amount);
            }
        }
    }

    /**
     * makeWithdraw
     *      pls use withdraw method from Accounts class
     */
    public void makeWithdraw(int acctNumber, double amount) {
        for (int i=0; i < numAccounts; i++) {
            if (custAccounts[i].accountNumber == acctNumber) {
                custAccounts[i].withdraw(acctNumber, amount);
            }
        }
    }

    /**
     * getBankBalance
     *      with 1 argument
     *      pls use showBalance method from Accounts class
     *
     * Account Number: 1234
     * Balance $ 100.00
     *
     */
    public void getBankBalance(int acctNumber) {
        for (int i=0; i < numAccounts; i++) {
            if (custAccounts[i].accountNumber == acctNumber) {
                custAccounts[i].showBalance(acctNumber);
            }
        }
    }

    /**
     * getBankBalance
     *      with no arguments
     *      pls use showBalance method to print balance of
     *      all Account with the Customer
     *
     * Total number of Accounts: 5
     *
     * Account Number: 1234
     * Balance $100.00
     *
     * Account Number: 5678
     * Balance $200.00
     *
     * Account Number: 9012
     * Balance $200.00
     *
     * Account Number: 3456
     * Balance $2000.00
     *
     */
    public void getBankBalance() {
        for (int i=0; i < numAccounts; i++) {
            custAccounts[i].showBalance(custAccounts[i].accountNumber);
        }
    }


}
