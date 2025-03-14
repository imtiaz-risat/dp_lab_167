package Commands;

public class CreateAccount implements ICommand {

    public String accountNumber;
    public Double initialDeposit;

    public CreateAccount(String accountNumber, Double initialDeposit){
        this.accountNumber=accountNumber;
        this.initialDeposit=initialDeposit;
    }

    @Override
    public void Execute() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Execute'");
    }
    
}
