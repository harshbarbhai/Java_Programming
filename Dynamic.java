
import java.util.Scanner;

class Dynamic
{
    public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);
        int length=0;
        int arr[];

        System.out.println("enter the number of elements");
        length=sobj.nextInt();
        arr=new int[length];
        if(arr==null)
        {
            System.out.println("unable to allocate memory");
        }
        else
        {
            System.out.println("memory gets succesfully allocated");
        }
        arr=null;
        System.gc();

    }
}