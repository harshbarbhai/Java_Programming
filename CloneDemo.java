class Demo implements Cloneable
{
    public int i;
    public int j;

    public Demo(int a,int b)
    {
        this.i=a;
        this.j=b;
    }

    public Object clone() throws CloneNotSupportedException //we should write implements Cloneable compelsary to implement this
    {
        return super.clone();
    }

}


class CloneDemo
{
    public static void main(String a[])
    {
        try
        {
        Demo dobji= new Demo(11,21);
        Demo dobj2= (Demo)dobj1.clone();

        System.out.println(dobj2.i);
        System.out.println(dobj2.j);
        }
        catch(CloneNotSupportedException)
        {
            
        }


    }
}