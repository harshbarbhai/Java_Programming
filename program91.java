import java.util.*;

class Digit
{
    public int SumDigits(int iNo)
    {
        int iDigit=0;
        int isum=0;
        while(iNo!=0)
        {
            iDigit=iNo%10;
            isum=isum+iDigit;
            iNo=iNo/10;
        }
        return isum;

    }
}


class program91
{
    public static void main(String a[])
    {
        int iValue=0;
        int iRet=0;
       
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter iNo:");
        iValue=sobj.nextInt();

        Digit dobj=new Digit();
        iRet=dobj.SumDigits(iValue);
        System.out.println("sum is:"+iRet);
        
        //important 

        sobj=null;
        dobj=null;
        System.gc();   
    }
}