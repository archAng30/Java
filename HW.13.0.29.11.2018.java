package HW13029112018;
import java.util.Scanner;

public class HW13029112018 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        
        int iInput = 0;
        
        do
        {
        System.out.print("Insert a number > 0: ");
        iInput = kb.nextInt();
        } while(iInput <= 0);
        
        int S = 0,
            iLoop = 0;
        
        
        for(iLoop = 1; iLoop <= iInput; iLoop++)
        {
            S += iLoop;
            System.out.println(S);
        }
    }
}
