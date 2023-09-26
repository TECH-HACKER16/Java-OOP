//Can be used to invoke current class constructor.
public class This3 
{
    This3()
    {
        System.out.print("Hiiiiiiii");

    }
    This3(String s)
    {
        this();
        System.out.println(s);
    }
    public static void main(String[] args) {
        This3 ts = new This3(" Hello");

    }
}
