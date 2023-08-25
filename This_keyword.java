//can be used to refer current class instance variable
public class This_keyword {
    
    String m;
    This_keyword(String m)
    {
        this.m=m;
    }
    void display()
    {
        System.out.println("This is "+ m);
        
    }

    public static void main(String[] args) {
        This_keyword th = new This_keyword("this keyword in java");
        th.display();
        
    }
}
