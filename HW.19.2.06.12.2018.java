package net.knowledgedb;

public class ShipDemo
{
    public static void main(String[] args)
    {
        Ship korabche = new Ship(60, 20, 2009, 17500, "Korabche");
        Ship parahod = new Ship(90, 35, 2012, 38900, "Parahod");

        Motorboat  lodka1 = new Motorboat(2011, 3600);
        Motorboat lodka2 = new Motorboat(2012, 4100);

        korabche.getAll();
        korabche.runFast(true);
        korabche.runFast(false);
        korabche.park();
        boolean action;
        lodka1.Ship(false);
        lodka1.Ship(true);
        System.out.println("\n");
        parahod.getAll();
        parahod.runFast(true);
        parahod.runFast(false);
        parahod.park();
        lodka2.Ship(false);
        lodka2 .Ship(true);
    }
}
