class Logic
{
///////////////////////////////////////////////////////////////////////////////////
//function Name:printOddNumbers
//Description:logic to print all odd numbers
//input type:int
//output type:void
//Auther Name:Harsh Barbhai
//Date:27/11/2025
////////////////////////////////////////////////////////////////////////////////////
    void printOddNumbers(int num)
    {
        int iCnt=0;
        for(iCnt=0;iCnt<=num;iCnt++)
        {
            if((iCnt % 2)!=0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class Assignment_88
{
    public static void main(String a[])
    {
        Logic lobj=new Logic();
        lobj.printOddNumbers(20);
    }
}
