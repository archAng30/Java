package HW17029112018;
import java.util.Scanner;

public class HW17029112018 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        
        int input = 0,
            i = 0,
            fl = 0;
        
        do
        {
            System.out.print("Insert and integer > 1: ");
            input = kb.nextInt();
        } while (input <= 1);
        
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
