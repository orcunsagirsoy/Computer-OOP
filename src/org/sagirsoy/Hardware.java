package org.kodluyoruz;

public abstract class Hardware
{

    public String brand;
    public double price;
    public int power;

    public abstract void setBrand(String brand);
    public abstract void setPrice(double price);
    public abstract void setPower(int power);

    abstract double calculatePrice();


}
