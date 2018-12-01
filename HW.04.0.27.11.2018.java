package HW4027112018;
import java.util.Scanner;

public class HW4027112018 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int iFirst = keyboard.nextInt();
        
        System.out.print("Enter an integer: ");
        int iSecond = keyboard.nextInt();
                
        int temp;
        
        if(iFirst < iSecond)
        {
            System.out.println("iFirst = " + iFirst);
            System.out.println("iSecond = " + iSecond);
        }
        else
        {
            temp = iFirst;
            iFirst = iSecond;
            iSecond = temp;
            
            System.out.println("iFirst = " + iFirst);
            System.out.println("iSecond = " + iSecond);
        }
    }
}
