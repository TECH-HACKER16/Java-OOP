//invoking parent class instance variable using Super keyword
class Vechicle
{  
    String colour="gray";  
}  
class Bike extends Vechicle
{  
    String colour="yellow";  
    void Colour()
    {  
        System.out.println(colour); 
        System.out.println(super.colour);
    }  
}  
class Super_Keyword
{  
    public static void main(String args[])
    {  
        Bike obj =new Bike();  
        obj.Colour();  
   }   
}  