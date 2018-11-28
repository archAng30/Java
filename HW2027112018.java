package HW2027112018;

import java.util.Scanner;

public class HW2027112018 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int iFirst = keyboard.nextInt();
        
        System.out.print("Enter an integer: ");
        int iSecond = keyboard.nextInt();
        
        System.out.println("iFirst + iSecond = " + (iFirst + iSecond));
        System.out.println("iFirst - iSecond = " + (iFirst - iSecond));
        System.out.println("iFirst * iSecond = " + (iFirst * iSecond));
        System.out.println("iFirst / iSecond = " + (iFirst / iSecond));
        System.out.println("iFirst % iSecond = " + (iFirst % iSecond));
    }
}
