
class Logic
{
///////////////////////////////////////////////////////////////////////////////////////////
//function Name:checkPalindrome
//Description:logic to check whether the number is palindrome or not
//input type:int
//output type:void
//Auther Name:Harsh Barbhai
//Date:18/11/2025
///////////////////////////////////////////////////////////////////////////////////////////
    void checkPalindrome(int num)
    {
        int no=0; 
        int iComp=num;
        int iRev=0;   
        while(num>0)
        {
            no=num%10;
            iRev=iRev*10+no;
            num=num/10;
            
        }
        if(iComp==iRev)
        {
            System.out.println("number is palindrome");
        }
        else
        {
            System.out.println("number is not palindrome");
        }
        
    }
}

class Assignment_82
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.checkPalindrome(121);
    }
}