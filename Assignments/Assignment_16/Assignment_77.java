
class Logic
{
///////////////////////////////////////////////////////////////////////////////////////////
//function Name:calculateEvenOdd
//Description:check whether even or odd
//input type:int
//output type:void
//Auther Name:Harsh Barbhai
//Date:18/11/2025
///////////////////////////////////////////////////////////////////////////////////////////
    void calculateEvenOdd(int num)
    {
        if((num%2)==0)
        {
            System.out.println("given number is even");
        }
        else
        {
            System.out.println("given number is odd");
        }

    }
}

class Assignment_77
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.calculateEvenOdd(7);
    }
}