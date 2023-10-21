package src;

public class Motorcycle implements IMoto{
    private String name;
    private String model;
    private int year;
    private double price;

    public Motorcycle(String name, String model, int year, double price){
        this.name = name;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void displayInfo() {
        System.out.println("Мотоцикл: " + name);
        System.out.println("Модель: " + model);
        System.out.println("Год Выпуска: " + year);
        System.out.println("Цена: " + price + " $");
    }
}
