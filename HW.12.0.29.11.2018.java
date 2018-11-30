package HW12029112018;
import java.util.Scanner;

public class HW12029112018 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        
        int i = 0,
            j = 0;
        
        System.out.print("Insert integer1: ");
        i = kb.nextInt();
        System.out.print("Insert integer2: ");
        j = kb.nextInt();
        
        int temp = 0;
        
        if(i > j)
        {
         temp = i;
         i = j;
         j = temp;
        }
        
        int lFactor = 0;
        
        for(lFactor = i; lFactor <= j; lFactor++)
        {
            System.out.println(lFactor);
        }
    }
}
