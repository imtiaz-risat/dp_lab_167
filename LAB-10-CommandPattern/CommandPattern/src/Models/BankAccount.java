package Models;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    public String accountNumber;
    public Double balance;
    public List<Transaction> transactions = new ArrayList<Transaction>();

    public void deposit(Transaction t){
        balance += t.amount;
        // process deposit
    }

    public void withdraw(Transaction T){
        
    }
}


