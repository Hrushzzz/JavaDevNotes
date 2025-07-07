package DesignPatterns.Adapter;

public class ICICIBankAdapter implements BankAPIAdapter{

    private ICICIBankAPILibrary iciciBankAPILibrary;

    public ICICIBankAdapter() {
        this.iciciBankAPILibrary = new ICICIBankAPILibrary();
    }

    @Override
    public double checkBalance(User user) {
        return iciciBankAPILibrary.checkBalance(user.getUserToken());
    }

    @Override
    public int doTransaction(User fromUser, User toUser, double amount) {
        int result = iciciBankAPILibrary.transferMoney(fromUser.getUserToken(), toUser.getUserToken(), amount);
        return result;
    }

    @Override
    public boolean addBankDetails(BankDetails bankDetails) {
        boolean result = iciciBankAPILibrary.addBankAccount(bankDetails.getAccountNumber(), bankDetails.getIfsc(), bankDetails.getPhoneNumber(), bankDetails.getPin());
        return result;
    }

}
