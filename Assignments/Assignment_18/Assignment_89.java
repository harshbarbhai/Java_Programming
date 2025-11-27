class Logic
{
///////////////////////////////////////////////////////////////////////////////////
//function Name:sumEvenOddDigits
//Description:logic to find the sum of even and odd digits separately in a number
//input type:int
//output type:void
//Auther Name:Harsh Barbhai
//Date:28/11/2025
////////////////////////////////////////////////////////////////////////////////////
    void sumEvenOddDigits(int num)
    {
        int sum=0,eSum=0,oSum=0,iCnt=0;

        for(iCnt=num;iCnt>=0;iCnt--)
        {
            sum = num % 10;
            if(sum % 2 == 0)
            {
                eSum=sum+eSum;
            }
            else
            {
                oSum=sum +oSum;
            }
            num=num/10;
        }
        System.out.println("Sum of odd digits is: "+oSum);
        System.out.println("Sum of even digits is: "+eSum);
    }
}

class Assignment_89
{
    public static void main(String a[])
    {
        Logic lobj=new Logic();
        lobj.sumEvenOddDigits(123456);
    }
}
