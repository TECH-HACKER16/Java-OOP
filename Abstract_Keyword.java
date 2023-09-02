abstract class Vechicles
{
   abstract void wheels(); // Using parent class methods as template
   abstract void engine();
}
class Car extends Vechicles 
{
   void wheels()
   {
      System.out.println("Cars have 4 wheels");
   }
   void engine()
   {
      System.out.println("Cars have bigger engines compared to bike engines");
   }
}

public class Abstract_Keyword 
{
 public static void main(String[] args) 
 {
   Car a = new Car();
   a.engine();
   a.wheels();
 }   
}