package Query;

import Models.BankAccount;

public class GetTransactionHistory implements IQuery {
    public BankAccount bankAccount;

    public GetTransactionHistory(BankAccount bankAccount){
        this.bankAccount=bankAccount;
    }

    @Override
    public void Execute() {
        // bankAccount.transactions theke fetch krbo
    }
    
}
