package src;

public class Payment implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("Оплата Картой -" + amount + " $");
    }
}