
class Logic
{
///////////////////////////////////////////////////////////////////////////////////////////
//function Name:countDigits
//Description:logic to count the numbers of digit in given number
//input type:int
//output type:void
//Auther Name:Harsh Barbhai
//Date:18/11/2025
///////////////////////////////////////////////////////////////////////////////////////////
    void countDigits(int num)
    {
        int no=0;
        int iCnt=0;
        while(num>0)
        {
            no=num%10;
            num=num/10;
            iCnt++;
        }
        System.out.println(iCnt);
    }
}

class Assignment_80
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.countDigits(12345);
    }
}