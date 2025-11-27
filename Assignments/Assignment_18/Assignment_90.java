class Logic
{
///////////////////////////////////////////////////////////////////////////////////
//function Name:checkSign
//Description:program to check whether number is positive,negative,or zero
//input type:int
//output type:void
//Auther Name:Harsh Barbhai
//Date:27/11/2025
////////////////////////////////////////////////////////////////////////////////////
    void checkSign(int num)
    {
        if(num>0)
        {
            System.out.println("number is positive");
        }
        else if(num<0)
        {
           System.out.println("number is negative"); 
        }
        else if(num==0)
        {
            System.out.println("number is zero");
        }
        
    }
}

class Assignment_90
{
    public static void main(String a[])
    {
        Logic lobj=new Logic();
        lobj.checkSign(-4);
    }
}
