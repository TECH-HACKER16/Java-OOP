//invoking parent class method using Super keyword

class Vechicle
{
    void chassis()
    {
        System.out.println("Chassis is made very strong in vechicle");
    }
}
class Bike extends Vechicle 
{
    void gear()
    {
        System.out.println("Generally bikes have 4 gears");
    }
    void fuel()
    {
        System.out.println("Generally bikes uses petrol");
    }
    void build_quality()
    {
        super.chassis();
        fuel();
    }
    
}
public class Super1 
{
    public static void main(String[] args) 
    {
        Bike obj = new Bike();
        obj.build_quality();
    }
}
