public class Method_Overloading {
    // int x;
    // int y;

    static int Method_O (int a,int b)
    {
     return a+b;
    }
    static int Method_O(int a,int b,int c)
    {
        return a+b+c;
    }
    static double Method_O (double a ,int b)
    {
        return a+b;
    }

    public static void main(String[] args) 
    {
        System.out.println(Method_O(9,9));
        System.out.println(Method_O(2,3,4));
        System.out.println(Method_O(20.8,80));
    }

    
}  


