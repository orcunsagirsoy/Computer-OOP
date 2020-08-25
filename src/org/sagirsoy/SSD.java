package org.kodluyoruz;

public class SSD extends Hardware
{
    private int memory;

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setPower(int power) {
        this.power = power;
    }

    @Override
    double calculatePrice() {
        double updatedPrice = this.price;
        if (getMemory() > 750){
            updatedPrice += ((getMemory()/250)*275);
        }
        return updatedPrice;
    }
}
