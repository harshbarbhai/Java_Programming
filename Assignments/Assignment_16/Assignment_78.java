
class Logic
{
///////////////////////////////////////////////////////////////////////////////////////////
//function Name:findFactorial
//Description:find factorial of given number
//input type:int
//output type:void
//Auther Name:Harsh Barbhai
//Date:18/11/2025
///////////////////////////////////////////////////////////////////////////////////////////
    void findFactorial(int num)
    {
        int iCnt=0;
        int fact=1;
        for(iCnt=1;iCnt<=num;iCnt++)
        {
            fact=fact*iCnt;
        }
        System.out.println("Factorial of given number is: "+fact);
    }
}

class Assignment_78
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.findFactorial(5);
    }
}