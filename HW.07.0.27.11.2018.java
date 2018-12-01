package HW7027112018;
import java.util.Scanner;

public class HW7027112018 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("What is the hour? ");
        int iHour = keyboard.nextInt();
        System.out.print("How much money you have? ");
        double dMoney = keyboard.nextDouble();
        System.out.print("Are you healthy? (true/false): ");
        boolean bFlag = keyboard.nextBoolean();
        
        if(bFlag)
        {
            if(dMoney > 10)
            {
                System.out.println("I am going to the cinema.");
            }
            else
            {
                System.out.println("I am going for a coffee.");
            }
        }
        else
        {
            if(dMoney > 0)
            {
                System.out.println("I am going to buy medicine.");
            }
            else
            {
                System.out.print("I will stay at hone and will drink tea.");
            }
        }
    }
}
