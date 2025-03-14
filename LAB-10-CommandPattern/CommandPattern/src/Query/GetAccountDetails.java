package Query;

import Memory.BankRepo;
import Models.BankAccount;

public class GetAccountDetails implements IQuery{

    public BankAccount bankAccount;
    public BankRepo bankRepo;

    public GetAccountDetails(BankAccount bankAccount){
        this.bankAccount=bankAccount;
    }

    @Override
    public void Execute() {
        // bank repo theke bankAccount khuje details show krbo
    }
}
