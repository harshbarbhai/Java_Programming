class Base1
{
    public int i=10;
    public void fun()
    {
        System.out.println("inside Base1");
    }
}
interface Base2 
{
    void fun();
}


public class MultipleInheritance extends Base1 implements Base2 
{
    public void fun() {
        System.out.println("Inside Base2");
        
    }
    public static void main(String a[])
    {
        Base1 bobj1=new Base1();
        bobj1.fun();
        Base2 bobj2=new MultipleInheritance();//upcasting
        bobj2.fun();
        

    }
    
}
