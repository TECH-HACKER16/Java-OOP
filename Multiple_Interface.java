interface Herbivores
{
    void eat();
}
interface Carnivores
{
    void eat1();
}
class Omnivores implements Herbivores,Carnivores
{
    public void eat()
    {
        System.out.println("Herbivores eat Plants to survive.");
    }
    public void eat1()
    {
        System.out.println("Carnivores eat other animals to survive.");
    }
    public void eat2()
    {
        System.out.println("Omnivores eat both plants and animals to survive.");
    }
}
public class Multiple_Interface
{
    public static void main(String[] args) 
    {
        Omnivores obj=new Omnivores ();
        obj.eat();
        obj.eat1();
        obj.eat2();
    }
}
