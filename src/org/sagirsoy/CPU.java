package org.kodluyoruz;

public class CPU extends Hardware
{
    public int cores;
    public int threads;

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
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

    public double calculatePrice(){
        double updatedPrice = this.price;
        if (getCores() >= 6){
            updatedPrice *= 1.30;
        }
        return updatedPrice;
    }

}
