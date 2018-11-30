package HW16029112018;
import java.util.Scanner;

public class HW16029112018 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        
        int a = 0,
            b = 0;
        
        do
        {
            System.out.print("Insert A = {1 - 200}: ");
            a = kb.nextInt();
        } while((a < 1) || (a > 200));
        
        do
        {
            System.out.print("Insert B = {1 - 200}: ");
            b = kb.nextInt();
        } while((b < 1) || (b > 200));
        
        int temp = 0;
        
        if(a > b)
        {
            temp = a;
            a = b;
            b = a;
        }        
        
        double S = 0.0;
        
        do
        {
            if(((int) (Math.pow(a, 2)) % 3 == 0))
            {
                System.out.print("skip " + a + ", ");
            }
            else
            {
                S += Math.pow(a, 2);
                System.out.print((int) Math.pow(a, 2) + ", ");
            }
            
            a++;
        } while((a <= b) && (S <= 200));
        
        System.out.print("\n");
    }
}
