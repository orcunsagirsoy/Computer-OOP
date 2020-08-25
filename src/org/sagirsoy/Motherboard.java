package org.kodluyoruz;

public class Motherboard extends Hardware
{
    public String cpuArchitect;
    public boolean wifiIncluded;
    public boolean bluetoothIncluded;

    public String getCpuArchitect() {
        return cpuArchitect;
    }

    public void setCpuArchitect(String cpuArchitect) {
        this.cpuArchitect = cpuArchitect;
    }

    public boolean isWifiIncluded() {
        return wifiIncluded;
    }

    public void setWifiIncluded(boolean wifiIncluded) {
        this.wifiIncluded = wifiIncluded;
    }

    public boolean isBluetoothIncluded() {
        return bluetoothIncluded;
    }

    public void setBluetoothIncluded(boolean bluetoothIncluded) {
        this.bluetoothIncluded = bluetoothIncluded;
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
        if (isWifiIncluded()){
            updatedPrice += 250;
        } else if (isBluetoothIncluded()){
            updatedPrice += 100;
        }
        return updatedPrice;
    }
}
