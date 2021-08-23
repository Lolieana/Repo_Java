package BankProject;

public class Bank {
    /**
     *
     * Due : Aug 22 2021
     *
     * Bank -> create Customer Object
     * customerObject we gonna run methods from Customer class
     * methods in Customer class will be using methods from Accounts class
     *
     * Every Customer can have maximum 5 bank account with Bank.
     *
     */

    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.createProfile("John Doe", "123-45-6789", "123-321-1231");
        c1.showProfile();
        c1.updateProfile("name", "Jane Doe");
        c1.showProfile();
        c1.openAnAccount("checking", 1000);
        c1.getBankBalance();
        c1.makeDeposit(1, 200);
        c1.getBankBalance(1);
        c1.openAnAccount("savings", 500);
        c1.makeWithdraw(2, 100);
        c1.showProfile();
        c1.getBankBalance();

        System.out.println("\n********************");

        Customer c2 = new Customer();
        c2.createProfile("Bob Smith", "987-65-4321", "321-234-5432", "New York");
        c2.openAnAccount("checking", 1500);
        c2.showProfile();
        c2.getBankBalance();
        c2.updateProfile("cityname", "Los Angeles");
        c2.makeWithdraw(3, 150);
        c2.showProfile();
        c2.getBankBalance();

    }

}
