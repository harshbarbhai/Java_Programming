
import java.io.*;
class program75
{
    public static void main(String a[])
    {
        int iNo=0;
        int i=0;

        BufferedReader bobj=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter iNo:");
        try
        {
            iNo=Integer.parseInt(bobj.readLine());
        }
        catch(IOException iobj)
        {
            
        }
        
        for(i=1;i<=(iNo/2);i++)
        {
            if((iNo % i) ==0)
            {
                System.out.println(i);
            }
        }
    }
}