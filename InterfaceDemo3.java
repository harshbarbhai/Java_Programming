interface Demo 
{
    int no=11; //public,staic ,final by default
    void Display(); //public ,abstract by default

}
class Hello implements Demo
{
    public void Display()
    {
        System.out.println("inside diapay");
    }

}
class InterfaceDemo3
{
    public static void main(String a[])
    {
        System.out.println(Demo.no);//allowed because no is public and static because of interface
       // Demo.no=12;//not allowed because no is final
        Hello hobj=new Hello(); 
        hobj.Display();

    }
}