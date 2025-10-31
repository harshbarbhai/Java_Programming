class Base
{
    public int i,j;
    public void fun()
    {
        System.out.println("inside Base fun");
    }
    public void gun()
    {
        System.out.println("inside Base gun");
    }
    public void sun()
    {
        System.out.println("inside Base sun");
    }
    public void bun()
    {
        System.out.println("inside Base bun");
    }

}

class Derived extends Base
{
    public int x;
    public void gun()
    {
        System.out.println("inside Derived gun");
    }
    public void sun()
    {
        System.out.println("inside Derived sun");
    }
    public void run()
    {
        System.out.println("inside Derived run");
    }
    public void mun()
    {
        System.out.println("inside Derived mun");
    }

}

class RMDDemo2
{
    public static void main(String A[])
    {
        
        Base bp=new Derived();   //upcasting

        bp.fun();  //Base fun
        bp.gun();  //Derived gun   because all function in java are virtual 
        bp.sun();  //Derived sun
        //bp.run();  //error
        //bp.mun();  //error
        bp.bun();  //Base bun
        




    }
}