package org.kodluyoruz;

public class GPU extends Hardware
{
    private int memory;
    public int bits;

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getBits() {
        return bits;
    }

    public void setBits(int bits) {
        this.bits = bits;
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
        if (getMemory() > 8){
            updatedPrice += (getMemory()/2)*250;
        } else if (getBits() > 128){
            updatedPrice += (getBits()/64)*400;
        }
        return updatedPrice;
    }
}
