package HW14029112018;
import java.util.Scanner;

public class HW14029112018 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        
        int iChoice = 0;
        
        do
        {
        System.out.print("Insert an integer: ");
        iChoice = kb.nextInt();
        } while(iChoice<= 0);
        
        int iLoop = 0;
        
        for(iLoop = 0; iLoop <= iChoice; iLoop++)
        {
            if((iLoop % 3) == 0)
            {
                System.out.print(iLoop + ", ");
            }
        }
    }
}
