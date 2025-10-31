import java.util.Scanner;

class SelectionDemo2 
{
    public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);
        int istd=0;
        System.out.println("enter your std");
        istd=sobj.nextInt();

        if(istd==1)
        {
            System.out.println("exam at 9am");

        }
        else if(istd==2)
        {
            System.out.println("exam at 10am");
        }
        else if(istd==3)
        {
            System.out.println("exam at 11am");
        }
        else if(istd==4)
        {
            System.out.println("exam at 12noon");
        }
        else
        {
            System.out.println("invalid standard");
        }
       
        
    }
    
}
