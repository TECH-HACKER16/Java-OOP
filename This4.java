//Can be passed as an argument in the method call.
public class This4 

{
    public void m1(This4 Teja)
    {
        System.out.println("Invoked method");
    }
    public void m2()
    {
        m1(this);
    }

    public static void main(String[] args) {
        This4 ts = new This4();
        ts.m2();
    }
}