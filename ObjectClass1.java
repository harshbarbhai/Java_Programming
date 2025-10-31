class Demo
{

}
class ObjectClass1  //internally extends Object
{
    public static void main(String a[])
    {
        Demo dobj=new Demo();
        System.out.println(dobj.hashCode());
        System.out.println(dobj.getClass());

    }
}