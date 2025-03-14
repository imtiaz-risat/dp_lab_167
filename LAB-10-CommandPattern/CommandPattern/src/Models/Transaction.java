package Models;

import java.util.List;

public class Transaction {
    public String type;
    public Double amount;
    BankAccount senderAccount;
    List<BankAccount> recieverAccounts;

    // Account to Account (Transfer)
    public Transaction(BankAccount senderAccount, BankAccount recieverAccount, Double amount){
        //
    }
}
