package org.kodluyoruz;

public class Computer
{
    public Hardware getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Hardware motherboard) {
        this.motherboard = motherboard;
    }

    public Hardware getCpu() {
        return cpu;
    }

    public void setCpu(Hardware cpu) {
        this.cpu = cpu;
    }

    public Hardware getRam() {
        return ram;
    }

    public void setRam(Hardware ram) {
        this.ram = ram;
    }

    public Hardware getSsd() {
        return ssd;
    }

    public void setSsd(Hardware ssd) {
        this.ssd = ssd;
    }

    public Hardware getGpu() {
        return gpu;
    }

    public void setGpu(Hardware gpu) {
        this.gpu = gpu;
    }

    private Hardware motherboard;

    private Hardware cpu;

    private Hardware ram;

    private Hardware ssd;

    private Hardware gpu;

    public double getTotalPrice()
    {

        return cpu.calculatePrice() + gpu.calculatePrice() + motherboard.calculatePrice() + ram.calculatePrice() + ssd.calculatePrice();
    }

    public int getTotalPower()
    {

        return cpu.power + gpu.power + motherboard.power + ram.power + ssd.power;
    }

}
