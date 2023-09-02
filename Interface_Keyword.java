interface Solar_System
{
    void Mercury();
    void Venus();
    void Earth();
}
class Sun implements Solar_System
{
    public void Mercury()
    {
        System.out.println("Mercury is the smallest & closest planet to the sun.");
    }
    public void Venus()
    {
        System.out.println("Venus, second planet from the Sun.");
    }
    public void Earth()
    {
        System.out.println("Earth is our home and it's also a big one!");
    }
}
public class Interface_Keyword 
{
    public static void main(String[] args) 
    {
        Sun a = new Sun();
        a.Mercury();
        a.Venus();
        a.Earth();
    }
}
