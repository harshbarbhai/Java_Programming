
class Logic
{
///////////////////////////////////////////////////////////////////////////////////////////
//function Name:findMax
//Description:logic to find maximum of two numbers
//input type:int
//output type:void
//Auther Name:Harsh Barbhai
//Date:18/11/2025
///////////////////////////////////////////////////////////////////////////////////////////
    void findMax(int a,int b)
    {
        if(a>b)
        {
            System.out.println(a+" is greater than" +b);
        }
        else if(a==b)
        {
            System.out.println(a+" and "+b+" are equal ");
        }
        else 
        {
            System.out.println(b+" is greater than "+a);
        }
    }
}

class Assignment_83
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.findMax(20,25);
    }
}