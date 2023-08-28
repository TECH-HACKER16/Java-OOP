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
class hiphop extends Music
{
    void telugu1()
    {
        System.out.println("This is telugu hiphop music");
    }
    void hindi1()
    {
        System.out.println("This is hindi hiphop music");
    }
    void malayalam1()
    {
        System.out.println("This is malayalam hiphop music");
    }
}
class party extends hiphop
{
    void telugu2()
    {
        System.out.println("This is telugu party music");
    }
    void hindi2()
    {
        System.out.println("This is hindi party music");
    }
    void malayalam2()
    {
        System.out.println("This is malayalam party music");
    }
}
    public class Multi_Inheritance
{
    public static void main(String[] args) 
    {
        party obj = new party();
        obj.telugu();
        obj.telugu1();
        obj.telugu2();
    }
}