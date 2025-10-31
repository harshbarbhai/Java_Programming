class TablePrinter
{
    public void printTable(int n)
    {
        int i=0;
        for(i=1;i<=10;i++)
        {
            System.out.println("Name :"+Thread.currentThread().getName()+" :"+n*i);
        }
    }
}

class Demo extends Thread
{
    public void run() 
    {
        
    }
}

class ThreadUserDefineSynchronised

{
    public static void main(String A[]) 
    {
        TablePrinter tobj = new TablePrinter();
        tobj.printTable(4);
        tobj.printTable(5);
        
    }
}