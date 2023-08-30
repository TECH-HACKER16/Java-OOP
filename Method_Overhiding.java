class Animals
{
    static void eat()
    {
        System.out.println("Animals eat food");
    } 
    void roar()
    {
        System.out.println("Animals can roar");
    }
}
class wild extends Animals
{
    static void eat()
    {
        System.out.println("Wild animals also eat");
    }
    void roar()
    {
        System.out.println("Wild animals also roar");
    }
}
public class Method_Overhiding 
{
    public static void main(String[] args) 
    {
       Animals an = new wild();
       an.eat(); 
    }
}
