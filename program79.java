import java.util.*;

class Number
{
    public boolean CheckPerfect(int iNo)
    {
        int i=0;
        int sum=0;
        for(i=1;i<=(iNo/2);i++)
        {
            if((iNo % i) ==0)
            {
                sum=sum+i;
            }
        }
        if(iNo==sum)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}  //End of Number class

class program79
{
    public static void main(String a[])
    {
        int iValue=0;
        boolean bRet=false;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter iNo:");
        iValue=sobj.nextInt();

        Number nobj=new Number();
        bRet=nobj.CheckPerfect(iValue);

        if(bRet==true)
        {
            System.out.println(iValue+" is perfect number");
        }
        else
        {
            System.out.println(iValue+" is not perfect number");

        }
        
        //important 
        sobj=null;
        nobj=null;
        System.gc();   
    }
}