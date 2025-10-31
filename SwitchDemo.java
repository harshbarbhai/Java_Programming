import java.util.Scanner;

class SwitchDemo 
{
    public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);
        int istd=0;
        System.out.println("enter your std");
        istd=sobj.nextInt();

        switch(istd)
        {
            case 1:
            System.out.println("EXAM AT 9 AM");
            break;

            case 2:
            System.out.println("EXAM AT 10 AM");
            break;

            case 3:
            System.out.println("EXAM AT 11 AM");
            break;

            case 4:
            System.out.println("EXAM AT 12 NOON");
            break;
            

            default:
            System.out.println("STANDARD NOT VALID");
            break;

        }
       
        
    }
    
}
