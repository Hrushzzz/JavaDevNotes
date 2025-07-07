package DesignPatterns.Adapter;

public class YesBankAPILibrary {

    public long getBalance(String userName, String password) {
        return 1000;
    }

    public char doTransaction(String fromUserName, String toUserName, String fromUserPassword, double amount) {
        return 'y';
    }

    public int createBankConnection(BankDetails bankDetails) {
        return 1;
    }
}
