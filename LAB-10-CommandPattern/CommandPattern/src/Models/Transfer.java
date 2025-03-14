package Models;

public class Transfer extends Transaction {
    public BankAccount senderAccount;
    public BankAccount receiverAccount;

    public Transfer(BankAccount senderAccount, BankAccount recieverAccount, Double amount) {
        super(senderAccount, recieverAccount, amount);
        //TODO Auto-generated constructor stub
        this.type = "transfer";
    }
    
}
