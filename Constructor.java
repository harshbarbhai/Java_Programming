class Demo
{
    public int ino1;
    public int ino2;

    public Demo()
    {
        System.out.println("inside default constructor");

    }
    public Demo(int i,int j)
    {
        System.out.println("inside parametarised constructor");

    }
}

class Constructor
{
    public static void main(String arr[])
    {
        Demo dobj1=new Demo();           //Demo dobj1() in c++
        Demo dobj2=new Demo(11,21);
    }
}