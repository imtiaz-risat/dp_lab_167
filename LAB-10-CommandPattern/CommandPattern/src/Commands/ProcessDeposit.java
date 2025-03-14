package Commands;
import Models.BankAccount;
import Models.Transaction;

public class ProcessDeposit implements ICommand {
    public BankAccount from;
    public BankAccount to;
    public Double amount;

    public ProcessDeposit(Transaction transaction){
        // 
    }

    @Override
    public void Execute() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Execute'");
    }
    
}
