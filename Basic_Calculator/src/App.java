import arithmetic.java.*;
import java.util.*;

public class App 
{
    public static void main(String[] args) 
    {
        System.out.print("\n********\n");
        System.out.print("* MENU *\n");
        System.out.println("********\n");
        System.out.println("\n 1.) Addition\n 2.) Subtraction\n 3.) Multiplication\n 4.) Division\n");
        System.out.print("\n\nEnter your choice: ");
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        Basic_calc obj =new Basic_calc();
        if(n!=5)
        {
            
            switch(n)
            {
                
                case 1:
                int a,b;
                System.out.print("\nEnter first number :");
                a = sc.nextInt();

                System.out.print("\nEnter your second number :");
                b = sc.nextInt();
                int result = obj.Add(a,b);
                System.out.println("\nSum of given numbers is "+result);
                break;

                case 2:
                int c,d;
                System.out.print("\nEnter first number :");
                c = sc.nextInt();

                System.out.print("\nEnter your second number :");
                d = sc.nextInt();
                int result1 = obj.Sub(c,d);
                System.out.println("\nDifference of given numbers is "+result1);
                break;

                case 3:
                int e,f;
                System.out.print("\nEnter first number :");
                e = sc.nextInt();

                System.out.print("\nEnter your second number :");
                f = sc.nextInt();
                int result2 = obj.Sub(e,f);
                System.out.println("\nDifference of given numbers is "+result2);
                break;

                case 4:
                int g,h;
                System.out.print("\nEnter first number :");
                g = sc.nextInt();

                System.out.print("\nEnter your second number :");
                h = sc.nextInt();
                int result3 = obj.Sub(g,h);
                System.out.println("\nDifference of given numbers is "+result3);
                sc.close();
                break;
                
            }
        }
        else
        {
            System.exit(-908765);
        }   
    }
}
