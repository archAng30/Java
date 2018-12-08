package net.knowledgedb;

public class Motorboat
{
    private int year,
                price;

    Motorboat() {System.out.println("Default constructor.");}

    Motorboat(int year, int price)
    {
        this.year = year;
        this.price = price;
    }

    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}

    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}

    public void gettAll()
    {
        System.out.println(getYear());
        System.out.println(getPrice());
    }

    public void Ship(boolean action)
    {
        if(action){System.out.println("The motorbike gets to the ship.");}
        else System.out.println("The motorbike leaves the ship.");
    }
}
