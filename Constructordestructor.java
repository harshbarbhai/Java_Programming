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
      protected void finalize()
    {
        System.out.println("inside finalize");
    }
}

class Constructordestructor
{
    public static void main(String Arr[])
    {
        Demo dobj1 = new Demo();           //Demo dobj1() in c++
        Demo dobj2 = new Demo(11,21);   //Demo dobj2(10,11) in c++
        dobj1=null;
        dobj2=null;

        System.gc(); // Suggest GC to run, but no finalize() will be called
        System.out.println("end of main");
    }
}