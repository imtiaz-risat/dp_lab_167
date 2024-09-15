public interface PaymentMethod {
    void processPayment(double amount);
}

class CreditCard implements PaymentMethod{
    @Override
    public void processPayment(double amount){
        //
    }
}

class PayPal implements PaymentMethod{
    @Override
    public void processPayment(double amount){
        //
    }
}

class DigitalWallet implements PaymentMethod{
    @Override
    public void processPayment(double amount){
        //
    }
}
