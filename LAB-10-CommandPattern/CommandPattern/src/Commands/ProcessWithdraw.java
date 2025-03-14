package Commands;

import Models.BankAccount;
import Models.Transaction;

public class ProcessWithdraw implements ICommand {
    public BankAccount from;
    public Double amount;

    public ProcessWithdraw(Transaction transaction){
        //
    }

    @Override
    public void Execute() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Execute'");
    }
}
