interface A
{
    int no=11;
    void fun();

}
interface B 
{
    int no=21;
    void fun();

}
class Demo implements A,B //multiple inheritance
{
    public void fun()
    {
        System.out.println("inside fun"+no);

    }
    
}
class InterfaceDemo6
{
    public static void main(String a[])//no generates error
    {
        Demo dobj=new Demo();
        dobj.fun();
        
        
    }
}