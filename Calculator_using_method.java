import java.util.Scanner;

public class Calculator_using_method 
{ 
    int c;
    void Add(int x,int y)
    {
        c=x+y;
    }

    void Sub(int x,int y)
    {
        c=x-y;
    }

    void Mul(int x ,int y)
    {
        c=x*y;
    }

    void Div(int x,int y)
    {
        c=x/y;
    }

    void Rem(int x,int y)
    {
        c=x%y;
    }

    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("1.) Addition");
        System.out.println("2.) Subtraction");
        System.out.println("3.) Multiplication");
        System.out.println("4.) Division");

        System.out.println("Enter your choice");
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:

            int a ,b;

            System.out.println("Enter first number :");
            a = sc.nextInt();

            System.out.println("Enter your second number :");
            b = sc.nextInt();
            
            Calculator_using_method add = new Calculator_using_method();
            add.Add(a,b);
            System.out.println("Sum of given two numbers is " + add.c);

            case 2:

            int m,n;
        
            System.out.println("Enter first number :");
            m = sc.nextInt();

            System.out.println("Enter your second number :");
            n = sc.nextInt();
            
            Calculator_using_method sub = new Calculator_using_method();
            sub.Sub(m,n);
            System.out.println("Sum of given two numbers is "+ sub.c);
        
            case 3:

            int s,t;
            System.out.println("Enter first number :");
            s = sc.nextInt();

            System.out.println("Enter your second number :");
            t = sc.nextInt();
            
            Calculator_using_method mul = new Calculator_using_method();
            mul.Mul(s,t);
            System.out.println("Product of given two numbers is "+ mul.c);
    
            case 4:
            
            int p ,q;
    
            System.out.println("Enter first number :");
            p = sc.nextInt();

            System.out.println("Enter your second number :");
            q = sc.nextInt();
            
            Calculator_using_method div = new Calculator_using_method();
            Calculator_using_method rem = new Calculator_using_method();
            div.Div(p,q);
            rem.Rem(p,q);
            System.out.println("Result of given two numbers is "+ div.c);
            System.out.println("Remainder of given numbers is "+ rem.c);
            sc.close();

        }
    }
}


