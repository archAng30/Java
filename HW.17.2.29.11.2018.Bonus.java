package Bonus;
import java.util.Scanner;

public class Bonus 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        
        int i = 0,
            input = 0,
            menu = 0,
            exit = 0;
        
        do
        {
            System.out.println("\n\nМеню.");
            System.out.println("1. Проверка дали дадено число е четно.");
            System.out.println("2. Проверка дали дадено число е просто.");
            System.out.println("3. Изход.");
            
            System.out.print("\nВъведете вашият избор: ");
            menu = kb.nextInt();
            
            switch(menu)
            {
                    case 1:
                        System.out.print("Въведете цяло число: ");
                        input = kb.nextInt();
                        isSimple(input);
                        System.out.print("\nАко искате да продължите, натиснете 1: ");
                        if((exit = kb.nextInt()) == 1) exit = 1;
                        else exit = 0;
                        break;
                    case 2:
                        System.out.print("Въведете цяло число: ");
                        input = kb.nextInt();
                        isPrime(input);
                        System.out.print("\nАко искате да продължите, натиснете 1: ");
                        if((exit = kb.nextInt()) == 1) exit = 1;
                        else exit = 0;
                        break;
                    case 3: 
                        exit = 0;
                        break;
            }
        } while(exit != 0);
        
        System.out.println("\nБлагодаря, че използвахте нашият софтуер.");
    }
    
    public static void isPrime(int input)
    {
        int fl = 0,
            i = 0;
        
        for(i = 2; i < input; i++)
        {
            if(input % i == 0)
            {
                fl = 1;
                break;
            }
        }
        
        if(fl  == 0)
        {
            System.out.println(input + " е просто.");
        }
        else
        {
            System.out.println(input + " не е просто.");
        }
    }
    
    public static void isSimple(int input)
    {
        if(input % 2 == 0) System.out.println(input + " е четно.");
        else System.out.println(input + " е нечетно.");
    }
}
