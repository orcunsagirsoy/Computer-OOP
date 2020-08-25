package org.kodluyoruz;

public class RAM extends Hardware
{
    private int memory;
    public int frequency;

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
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
        if (getMemory() > 16){
            updatedPrice += ((getMemory()/4)*100);
        } else if (getFrequency() > 3600){
            updatedPrice += ((getFrequency()/400)*200);
        }
        return updatedPrice;
    }
}
