package HW5027112018;
import java.util.Scanner;

public class HW5027112018 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int iFirst = keyboard.nextInt();
        
        System.out.print("Enter an integer: ");
        int iSecond = keyboard.nextInt();
        
        System.out.print("Enter an integer: ");
        int iThird = keyboard.nextInt();
                
        int temp;
        
        if((iFirst < iSecond) && (iFirst < iThird))
        {
            if(iSecond < iThird)
            {
                System.out.println(iFirst + ", " + iSecond + ", " + iThird);
            }
            else
            {
                System.out.println(iFirst + ", " + iThird + ", " + iSecond);
            }
        }
        
        if((iSecond < iFirst) && (iSecond < iThird))
        {
            if(iFirst < iThird)
            {
                System.out.println(iSecond + ", " + iFirst + ", " + iThird);
            }
            else
            {
                System.out.println(iSecond + ", " + iThird + ", " + iFirst);
            }
        }
        if((iThird < iFirst) && (iThird < iSecond))
        {
            if(iFirst < iSecond)
            {
                System.out.println(iThird + ", " + iFirst + ", " + iSecond);
            }
            else
            {
                System.out.println(iThird + ", " + iSecond + ", " + iFirst);
            }
        }        
    }
}
