package src;

public class PaymentAdapter implements PaymentMethod{
    private PaymentMethod paymentMethod;

    public PaymentAdapter(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }
    @Override
    public void pay(double amount) {
        paymentMethod.pay(amount);
    }
}
