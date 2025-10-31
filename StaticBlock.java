class Demo
{
    public int i;      //instance variable
    static public int j;  //class variable 

    static 
    {
        j=21;

    }

    public Demo()
    {
        this.i=11;

    }

    public void fun()  //Instance method
    {
        System.out.println("fun i"+this.i);
        System.out.println("fun j"+Demo.j);
    }
    public static void gun()  //Class method
    {
        //System.out.println("gun i"+this.i);  //not allowed error
        System.out.println("gun i"+Demo.j);
    }
}

class StaticBlock
{
    public static void main(String A[])
    {
        Demo.gun();
        System.out.println(Demo.j);

        Demo dobj=new Demo();
        System.out.println(dobj.i);
        dobj.fun();

    }
}