//imp program

interface A
{
    int no=11;
    void fun();
    default void gun() //default use to call concreat method 
    {   
        System.out.println("inside gun");

    }

}

class Demo implements A 
{
    public void fun()
    {
        System.out.println("inside fun");

    }
    
}
class InterfaceDemo8
{
    public static void main(String a[])
    {
        Demo dobj=new Demo();
        dobj.fun();
        dobj.gun();
        
        
    }
}