// This is our application code, we need to access the methods from 3rd party API's

package DesignPatterns.Adapter;

public class PhonePe {

    private BankAPIAdapter bankAPIAdapter;

    public PhonePe(BankAPIAdapter bankAPIAdapter) {
        this.bankAPIAdapter = bankAPIAdapter;
    }

    public void transferMoney(User fromUser, User toUser, double amount) throws Exception {
        double currentBalance = bankAPIAdapter.checkBalance(fromUser);
        if (currentBalance >= amount) {
            int result = bankAPIAdapter.doTransaction(fromUser, toUser, amount);
            if (result == 1) {
                currentBalance = bankAPIAdapter.checkBalance(toUser);
                System.out.println("Current Balance is :: " + currentBalance);
            }
        } else {
            throw new Exception("Insufficient Balance");
        }
    }
}
