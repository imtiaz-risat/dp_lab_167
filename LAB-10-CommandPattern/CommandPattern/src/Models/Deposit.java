package Models;

public class Deposit extends Transaction {
    public BankAccount account;

    public Deposit(BankAccount senderAccount, BankAccount recieverAccount, Double amount) {
        super(senderAccount, recieverAccount, amount);
        //TODO Auto-generated constructor stub
    }    
}
