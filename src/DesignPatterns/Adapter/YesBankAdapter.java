package DesignPatterns.Adapter;

public class YesBankAdapter implements BankAPIAdapter{

    private YesBankAPILibrary yesBankAPILibrary;

    public YesBankAdapter() {
        this.yesBankAPILibrary = new YesBankAPILibrary();
    }

    @Override
    public double checkBalance(User user) {
        long balance = yesBankAPILibrary.getBalance(user.getUserName(), user.getPassword());
        double result = balance;
        return result;
    }

    @Override
    public int doTransaction(User fromUser, User toUser, double amount) {
        char result = yesBankAPILibrary.doTransaction(fromUser.getUserName(), toUser.getUserName(), fromUser.getPassword(), amount);
        if (result == 'y') {
            return 1;   // success
        } else if (result == 'n') {
            return 0;   // failure
        } else {
            return -1;   // in-progress
        }
    }

    @Override
    public boolean addBankDetails(BankDetails bankDetails) {
        int result = yesBankAPILibrary.createBankConnection(bankDetails);
        if (result == 1) {
            return true;
        } else {
            return false;
        }
    }
}
