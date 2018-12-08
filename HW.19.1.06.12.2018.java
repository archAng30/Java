package net.knowledgedb;

public class Ship
{
    private int     length,
                    width,
                    year,
                    price;
    private String  name;

    Ship() {System.out.println("The default conctructor.");}

    Ship(int length, int width, int year, int price, String name)
    {
        this.length = length;
        this.width = width;
        this.year = year;
        this.price = price;
        this.name = name;
    }

    public int getLength() {return length;}
    public void setLength(int length) {this.length = length;}

    public int getWidth() {return width;}
    public void setWidth(int width) {this.width = width;}

    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}

    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public void getAll()
    {
        System.out.println(getLength());
        System.out.println(getWidth());
        System.out.println(getYear());
        System.out.println(getPrice());
        System.out.println(getName());
    }

    public void runFast(boolean speed)
    {
        if(speed) System.out.println("The ship run fast.");
        else System.out.println("The ship run slow.");
    }

    public void park() {System.out.println("The shipe has parked on the coast.");}
}
