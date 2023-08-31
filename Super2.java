//Used to invoke parent class Constructor
class Vechicle
{
    Vechicle()
    {
        System.out.println("Chassis is made very strong in vechicle");
    }
}
class Bike extends Vechicle
{
    Bike()
    {
        super();
        System.out.println("bike");
    }
}
public class Super2 
{
    public static void main(String[] args) 
    {
        Bike obj = new Bike();
    }
}
