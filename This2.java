//Can be used to invoke current class method (implicitly)
public class This2 
{
    void display()
    {
        hide();
        System.out.println("this is");
    }
    void hide()
    {
        System.out.println("Teja");
    }
public static void main(String[] args) {
        
    This2 th = new This2();
    th.display();  
}
}
