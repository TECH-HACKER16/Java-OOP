//Can be passed as argument in the constructor call.
class InnerThis5
{
    This5 ob;
    InnerThis5(This5 ib)
    {
        this.ob=ib;
    }
    public void display()
    {
        System.out.println(ob.value1);
    }
}
public class This5 
{
   int value1=30;
   This5()
  {
    InnerThis5 it= new InnerThis5(this);
    it.display();
  } 
  public static void main(String[] args) 
  {
    This5 ts = new This5();
  }
}
