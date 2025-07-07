package DesignPatterns.Adapter;

public class AxisBankAdapter implements BankAPIAdapter{

    private AxisBankAPILibrary axisBankAPILibrary;

    public AxisBankAdapter() {
        this.axisBankAPILibrary = new AxisBankAPILibrary();
    }

    @Override
    public double checkBalance(User user) {
        return 0;
    }

    @Override
    public int doTransaction(User fromUser, User toUser, double amount) {
        return 0;
    }

    @Override
    public boolean addBankDetails(BankDetails bankDetails) {
        return false;
    }
}
