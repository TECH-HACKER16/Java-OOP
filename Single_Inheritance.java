class Music
{
    void telugu ()
    {
        System.out.println("This is telugu music");
    }    
}

class Hiphop extends Music
{
    void telugu1 ()
    {
        System.out.println("This is telugu hiphop music");
    }    
}


public class Single_Inheritance 
{
    public static void main(String[] args) 
    {
        Hiphop obj = new Hiphop();
        obj.telugu();
        obj.telugu1();

    }
}
