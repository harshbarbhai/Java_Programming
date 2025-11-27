
class Logic
{
///////////////////////////////////////////////////////////////////////////////////////////
//function Name:reverseNumber
//Description:logic to reverse number
//input type:int
//output type:void
//Auther Name:Harsh Barbhai
//Date:18/11/2025
///////////////////////////////////////////////////////////////////////////////////////////
    void reverseNumber(int num)
    {
        int no=0;
        while(num>0)
        {
            no=num%10;
            num=num/10;
            System.out.println(no);
        }
    }
}

class Assignment_79
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.reverseNumber(1234);
    }
}