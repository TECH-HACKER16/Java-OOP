public class Constructor 
{
    int a;
    String b;

    Constructor(int c,String d){
        a=c;
        b=d;
    }
    public static void main(String[] args) {
        Constructor obj = new Constructor(9," Bikes");
        Constructor obj1 = new Constructor(10," Cars");
        System.out.println(obj.a+obj.b);
        System.out.println(obj1.a+obj1.b);


        
    }
}
