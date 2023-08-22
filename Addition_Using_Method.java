//Addition of two numbers using method

import java.util.Scanner;

public class Addition_Using_Method 
{   
    int c;
    void Add(int x,int y)
    {
        c=x+y;
    }

    public static void main(String[] args) 
    {
        int a ,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        a = sc.nextInt();

        System.out.println("Enter your second number :");
        b = sc.nextInt();
        
        Addition_Using_Method add = new Addition_Using_Method();
        add.Add(a,b);
        System.out.println("Sum of given two numbers is "+add.c);
        sc.close();
   
    }
}

