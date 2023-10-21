package src;

public class QR implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Оплата QR - " + amount + " $");
    }
}