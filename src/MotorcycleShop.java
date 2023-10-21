package src;

import java.util.Scanner;

public class MotorcycleShop {
    private IMoto iMoto;

    public MotorcycleShop(IMoto iMoto){
        this.iMoto = iMoto;
    }
    public void displayMenu(){
        iMoto.displayInfo();
    }

    public void processOrder(PaymentMethod paymentMethod){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите Заказать Мотоцикл? (ДА / НЕТ) :");
        String choice = scanner.next().toLowerCase();

        if("ДА".equals(choice)){
            paymentMethod.pay(iMoto.getPrice());
            System.out.println("Спасибо за Заказ | Ваш Мотоцикл Будет Доставлен в Ближайшее Время!!");
        }else {
            System.out.println("Спасибо За Потраченное Время");
        }
    }

    public static void main(String[] args) {
        IMoto motorcycle = new Motorcycle("YAMAHA","R7",2023,5000);
        MotorcycleShop shop = new MotorcycleShop(motorcycle);
    }
}
