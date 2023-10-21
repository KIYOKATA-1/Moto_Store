package src;

public class Motorcycle implements IMoto{
    private String brand;
    private String model;
    private int year;
    private String color;
    private double price;

    @Override
    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    @Override
    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    @Override
    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    @Override
    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public void setYear(int year) {

    }

    @Override
    public int getYear(){
        return year;
    }
}
