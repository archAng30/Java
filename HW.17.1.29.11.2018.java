package Bonus;
import java.util.Scanner;

public class Bonus 
{
    
    
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        
        int input = 0,
            a = 0;
        
        do
        {
            System.out.print("Insert integer > 1: ");
            input = kb.nextInt();
        } while (input <= 2);
        
        for(a = 2; a <= input; a++)
        {
            isPrime(a);
        }
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
            System.out.println(input + " is prime.");
        }
        else
        {
            System.out.println(input + " is not prime.");
        }
    }
}
