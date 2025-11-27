
class Logic
{
///////////////////////////////////////////////////////////////////////////////////////////
//function Name:printTable
//Description:logic to print table of number
//input type:int
//output type:void
//Auther Name:Harsh Barbhai
//Date:18/11/2025
///////////////////////////////////////////////////////////////////////////////////////////
    void printTable(int num)
    {
        int iCnt=0;
        int table=0;
        for(iCnt=1;iCnt<=10;iCnt++)
        {
            table=num*iCnt;
            System.out.println(table);
        }
    }
}

class Assignment_85
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.printTable(5);
    }
}