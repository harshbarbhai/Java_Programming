class Hello 
{
    public int i;
    public Hello(int no)
    {
        System.out.println("inside hello constructor");
        this.i=no+1;
    }
    public void Display()
    {
        System.out.println("inside hello display");
    }
}

class Demo extends Hello
{
    public int i;
   
    
    public Demo(int a)
    {
        super(a); //first use
        System.out.println("inside demo constructor");
        this.i=a; 
    }
    
    public void Display()
    {
        int i=0;
        System.out.println("inside display"+i); //0
        System.out.println("inside display"+this.i); //51
        System.out.println("inside display"+super.i); //52  //second use
        super.Display();  //third use
    }

}

class SuperDemo
{
    public static void main(String A[])
    {
        Demo dobj=new Demo(51);
        dobj.Display();
        

    }
}