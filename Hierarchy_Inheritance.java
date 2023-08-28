class Music
{
    void telugu()
    {
        System.out.println("This is telugu music");
    }
    void hindi()
    {
        System.out.println("This is hindi music");
    }
    void malayalam()
    {
        System.out.println("This is malayalam music");
    }
}
class Hiphop extends Music
{
    void telugu1()
    {
        System.out.println("This is telugu Hiphop music");
    }
    void hindi1()
    {
        System.out.println("This is hindi Hiphop music");
    }
    void malayalam1()
    {
        System.out.println("This is malayalam Hiphop music");
    }
}
class Party extends Music
{
    void telugu2()
    {
        System.out.println("This is telugu Party music");
    }
    void hindi2()
    {
        System.out.println("This is hindi Party music");
    }
    void malayalam2()
    {
        System.out.println("This is malayalam Party music");
    }
}
    public class Hierachy_Inheritance
{
    public static void main(String[] args) 
    {
        Hiphop obj = new Hiphop();
        Party obj2 = new Party();
        obj.telugu();
        obj.telugu1();
        obj2.telugu2();
        obj.hindi();
        obj.hindi1();
        obj2.hindi2();
        obj.malayalam();
        obj.malayalam1();
        obj2.malayalam2();
    }
}