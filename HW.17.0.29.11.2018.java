package HW17029112018;
import java.util.Scanner;

public class HW17029112018 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        
        int input = 0;
        
        do
        {
            System.out.print("Insert and integer > 1: ");
            input = kb.nextInt();
        } while (input <= 1);
        
        int i = 0,
            flag = 0;
        
        for(i = 2; i <= input; i++)
        {
            if((input % i) == 0)
            {
                flag = 0;
            }
            else
            {
                flag = 1;
            }
        }
        
        if(flag == 0)
        {
            System.out.println(input + " is prime.");
        }
        else
        {
            System.out.println(input + " is not prime.");
        }
    }
}
