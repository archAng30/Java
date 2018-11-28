package HW;
import java.util.Scanner;

public class HW1027112018 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int iFirst = keyboard.nextInt();
        
        System.out.print("Enter an integer: ");
        int iSecond = keyboard.nextInt();
        
        System.out.println("Enter an integer: 5");
        int iThird = keyboard.nextInt();
        
        if((iFirst<iSecond)&&(iSecond<iThird))
        {
            System.out.println("iSecond is between iFirst and iThird.");         
        }
        else
        {
            System.out.println("iSecond is outside the interval from iFirst to iThird.");
        } 
    }
}

