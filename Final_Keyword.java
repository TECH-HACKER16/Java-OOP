final class car
{
    final int wheels = 2;
    final void Chassis()
    {
        System.out.println("Car has four wheels");
    }
}
public class Final_Keyword
{
    public static void main(String[] args)
    {
        car obj = new car();
        obj.Chassis();

        System.out.println("Bike has " + obj.wheels + " wheels");
    }
}