class Demo
{
    public int i;
    public static int j;
    
    static
    {
        j=21;
    }
    public Demo()
    {
        System.out.println("inside default");
        this.i=11; //fitst use
    }
    public Demo(int a)
    {
        this();  //second use //calls default constructor and should always be written on top
        System.out.println("inside parametarised");
        
    }
    public void Display()
    {
        System.out.println("inside display"+this.i);//third use
    }

}

class ThisDemo
{
    public static void main(String A[])
    {
        Demo dobj=new Demo(51);
        dobj.Display();

    }
}