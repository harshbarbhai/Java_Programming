class Logic
{
///////////////////////////////////////////////////////////////////////////////////
//function Name:checkEvenNumber
//Description:logic to check whether number even
//input type:int
//output type:void
//Auther Name:Harsh Barbhai
//Date:27/11/2025
////////////////////////////////////////////////////////////////////////////////////
    void checkEvenNumber(int num)
    {
        if((num % 2)==0)
        {
            System.out.println("given number is even");
        }
        else 
        {
            System.out.println("number is odd");
        }
    }
}

class Assignment_87
{
    public static void main(String a[])
    {
        Logic lobj=new Logic();
        lobj.checkEvenNumber(20);
    }
}
