//imp program

interface A
{
    int no=11; //public,static,final
    void fun(); //public,abstract=function without bodykuh  
    private void Display() //can be called from default
    {
        System.out.println("inside private display");
    }

    default void gun() //default use to call concreat method //concreat=function with body{}
    {   
        System.out.println("inside gun");
        Display();

    }
    
}

class Demo implements A 
{
    public void fun()
    {
        System.out.println("inside fun");

    }
    
}
class InterfaceDemo9
{
    public static void main(String a[])
    {
        Demo dobj=new Demo();
        dobj.fun();
        dobj.gun();
        //dobj.Display();//error
        
        
    }
}