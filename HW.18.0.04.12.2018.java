package net.knowledgedb;

public class ComputerDemo
{
    public static void main(String[] args)
    {
        Computer compi = new Computer();
        Computer laptopcho = new Computer();

        compi.setYear(2018);
        compi.setPrice(1800.00);
        compi.setNotebook(false);
        compi.setHardDiskMemory(1_099_511_627_776L); // 1 TB SSD
        compi.setFreeMemory(17_179_869_184L); // 16 GB RAM
        compi.setOperationSystem("Debian 9");

        compi.ChangeOperatingSystem("XUbuntu");
        compi.useMemory(100);

        compi.getAll();

        laptopcho.setYear(2018);
        laptopcho.setPrice(1380.00);
        laptopcho.setNotebook(true);
        laptopcho.setHardDiskMemory(1_099_511_627_776L); // 1 TB SSD
        laptopcho.setFreeMemory(8_589_934_592L); // 8 GB RAM
        laptopcho.setOperationSystem("Windows 7");

        laptopcho.ChangeOperatingSystem("Windows 8.1");
        laptopcho.useMemory(100);

        laptopcho.getAll();
    }
}
