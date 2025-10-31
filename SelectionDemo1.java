import java.util.Scanner;
class SelectionDemo1 
{
    public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);
        int ino=0;
        System.out.println("enter your age");
        ino=sobj.nextInt();

        if(ino >=18)
        {
            System.out.println("you can vote");
        }
        else
        {
            System.out.println("you cannot vote");
        }
        
    }
    
}
