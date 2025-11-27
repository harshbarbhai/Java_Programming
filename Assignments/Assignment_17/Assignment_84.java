
class Logic
{
///////////////////////////////////////////////////////////////////////////////////////////
//function Name:findMin
//Description:logic to find minimum of three numbers
//input type:int
//output type:void
//Auther Name:Harsh Barbhai
//Date:18/11/2025
///////////////////////////////////////////////////////////////////////////////////////////
    void findMin(int a,int b,int c)
    {
        if(a<b && a<c )
        {
            System.out.println(a+" is small than "+b+" and "+c);
        }
        else if(b<a && b<c)
        {
            System.out.println(b+" is small than "+a+" and "+c);
        }
        else if(c<a && c<b) 
        {
            System.out.println(c+" is small than "+a+" and "+b);
        }

    }
}

class Assignment_84
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.findMin(20,25,24);
    }
}