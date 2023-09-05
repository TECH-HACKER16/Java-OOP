import java.util.*;

class Details
{
    private String name ;
    private int age;
    private String Blood_group;
    private long Phone_number;
    private String Place_of_Living;

    public String getname()
    { 
        return name; 
    }
    public void setname(String Name)
    { 
        name=Name; 
    }

    public int getage()
    { 
        return age; 
    }
    public void setage(int Age)
    {
        age=Age; 
    }

    public String getBlood_group()
    { 
        return Blood_group; 
    }
    public void setBlood_group(String B_Group)
    { 
        Blood_group=B_Group; 
    }

    public long  getPhone_number()
    { 
        return Phone_number; 
    }
    public void setPhone_number(long no)
    { 
        Phone_number=no; 
    }

    public String getPlace_of_living()
    {
        return Place_of_Living;
    }
    
    public void setPlace_of_Living(String Address)
    {
        Place_of_Living=Address;
    }
}
public class Encapsulation 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Details obj = new Details();
        
        obj.setname("Raj");
        System.out.println("\n\t Name: "+obj.getname());

        obj.setage(20);
        System.out.print("\n\t Age :"+obj.getage()+"\n");

        obj.setBlood_group("B+");
        System.out.println("\n\t Blood group : "+ obj.getBlood_group());

        obj.setPhone_number(1234567890);
        System.out.println("\n\t Phone number : "+ obj.getPhone_number());

        obj.setPlace_of_Living("Vijayawada");
        System.out.println("\n\t Address : "+ obj.getPlace_of_living());

        sc.close();
    }
}
