package javablank;
import java.util.Scanner;

public class JavaBlank 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        
        int iChoice = 0;
        
        do
        {
        System.out.print("Insert an integer 0<&&<=9: ");
        iChoice = kb.nextInt();
        } while((iChoice < 0) || (iChoice > 9));
        
        System.out.print("Insert n\t" + "Insert n\t" + "Insert n\t" + "Insert n\n");
        System.out.print("1\t\t" + "2\t\t" + "3\t\t" + "4\n");
        
        int iLoop = 0;
        
        
        switch(iChoice)
        {
            case 0:
                System.out.print("0\n");
                break;
            case 1:
                System.out.print("0\t\t11\n");
                break;
            case 2:
                System.out.print("0\t\t11\t\t222\n");
                break;
            case 3:
                System.out.print("0\t\t11\t\t222\t\t3333\n");
                break;
            case 4:
                System.out.print("0\t\t11\t\t222\t\t3333\n");
                System.out.print("\t\t44\n");
                break;
            case 5:
                System.out.print("0\t\t11\t\t222\t\t3333\n");
                System.out.print("\t\t44\t\t555\n");
                break;
            case 6:
                System.out.print("0\t\t11\t\t222\t\t3333\n");
                System.out.print("\t\t44\t\t555\t\t6666\n");
                break;
            case 7:
                System.out.print("0\t\t11\t\t222\t\t3333\n");
                System.out.print("\t\t44\t\t555\t\t6666\n");
                System.out.print("\t\t777\n");
                break;
            case 8:
                System.out.print("0\t\t11\t\t222\t\t3333\n");
                System.out.print("\t\t44\t\t555\t\t6666\n");
                System.out.print("\t\t\t\t777\t\t8888\n");
                break;
            case 9:
                System.out.print("0\t\t11\t\t222\t\t3333\n");
                System.out.print("\t\t44\t\t555\t\t6666\n");
                System.out.print("\t\t\t\t777\t\t8888\n");
                System.out.print("\t\t\t\t\t\t9999\n");
                break;
            default:
        }
    }
}
