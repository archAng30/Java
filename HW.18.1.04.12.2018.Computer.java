package net.knowledgedb;

public class Computer
{
    int year = 0;
    double price = 0.0D;
    boolean isNotebook = false;
    long hardDiskMemory = 1_099_511_627_776L; // 1 TB SSD
    long freeMemory = 8_589_934_592L; // 8 GB RAM
    String operationSystem = " ";

    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}

    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}

    public boolean isNotebook() {return isNotebook;}
    public void setNotebook(boolean notebook) {isNotebook = notebook;}

    public long getHardDiskMemory() {return hardDiskMemory;}
    public void setHardDiskMemory(long hardDiskMemory) {this.hardDiskMemory = hardDiskMemory;}

    public long getFreeMemory() {return freeMemory;}
    public void setFreeMemory(long freeMemory) {this.freeMemory = freeMemory;}

    public String getOperationSystem() {return operationSystem;}
    public void setOperationSystem(String operationSystem) {this.operationSystem = operationSystem;}

    public void getAll()
    {
        if(isNotebook) System.out.println("This is notebook.");
        else System.out.println("This is PC.");

        System.out.println("Year:\t\t" + this.getYear());
        System.out.println("Price:\t\t" + this.getPrice());
        System.out.println("Disk Space:\t" + this.getHardDiskMemory());
        System.out.println("Memory:\t\t" + this.getFreeMemory());
        System.out.println("OS:\t\t\t" + this.getOperationSystem());
        System.out.println("\n");
    }

    void ChangeOperatingSystem(String newOperationSystem)
    {
        operationSystem = newOperationSystem;
        System.out.println("The new OS: " + operationSystem);
    }

    void useMemory(double memory)
    {
        freeMemory -= memory;

        if(freeMemory == 0) System.out.println("Not enough free memory.");
        else System.out.println("Available memory: " + freeMemory + "\n");
    }
}
