interface A
{
    void fun();

}
interface B 
{
    void gun();

}
class Demo implements A,B //multiple inheritance
{
    public void fun()
    {
        System.out.println("inside fun");

    }
    public void gun()
    {
        system.out.println("inside gun");

    }
}
class InterfaceDemo4
{
    public static void main(String a[])
    {
        Demo dobj=new Demo();
        dobj.fun();
        dobj.gun();
        
    }
}