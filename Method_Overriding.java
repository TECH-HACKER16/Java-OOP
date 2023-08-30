class Animals 
{
    void eat()
    {
        System.out.println("Animals eat food");
    }
}
class Domestic extends Animals
{
    void eat()
    {
        System.out.println("Domestic animals also eat food");
    }
}
public class Method_Overriding 
{
    public static void main(String[] args) 
    {
        Domestic obj = new Domestic();
        obj.eat();
    }
}
