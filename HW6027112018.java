package HW6027112018;
import java.util.Scanner;

public class HW6027112018 
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
        
        System.out.println(iFirst + ", " + iSecond + ", " + iThird);
        
        temp = iFirst;
        iFirst = iSecond;
        iSecond = iThird;
        iThird = temp;
        
        System.out.println(iFirst + ", " + iSecond + ", " + iThird);
    }    
}
