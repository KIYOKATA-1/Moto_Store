package src;

import java.util.Scanner;

public class MotorcycleShop {
    private IMoto iMoto;

    public MotorcycleShop(IMoto iMoto) {
        this.iMoto = iMoto;
    }

    public void displayMenu() {
        iMoto.displayInfo();
    }

    public void processOrder(PaymentMethod paymentMethod) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите Заказать Мотоцикл? (1~ДА / 2~НЕТ) :");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                paymentMethod.pay(iMoto.getPrice());
                System.out.println("Спасибо за Покупу");
            case 2:
                break;
        }

    }

    public static void main(String[] args) {
        IMoto[] motorcycles = {
                new Motorcycle("YAMAHA", "R7", 2023, 5000),
                new Motorcycle("KAWASAKI", "ZX-6R", 2021, 4000),
                new Motorcycle("Honda", "CBR1000RR", 2021, 12000)
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Доступные мотоциклы:");
        for (int i = 0; i < motorcycles.length; i++) {
            System.out.println((i + 1) + ". " + motorcycles[i].getName() + " " + motorcycles[i].getModel() + " " + motorcycles[i].getYear());
        }
        System.out.print("Выберите мотоцикл (1-" + motorcycles.length + "): ");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= motorcycles.length) {
            MotorcycleShop shop = new MotorcycleShop(motorcycles[choice - 1]);

            PaymentMethod paymentMethod = null;
            Scanner scann = new Scanner(System.in);
            System.out.print("Выберите Способ Оплаты (1.Карта | 2.QR): ");
            int paymentChoice = scann.nextInt();
            switch (paymentChoice) {
                case 1:
                    paymentMethod = new PaymentAdapter(new Payment());

                case 2:
                    paymentMethod = new PaymentAdapter(new QR());
            }

            shop.displayMenu();
            shop.processOrder(paymentMethod);
        }
    }
}
