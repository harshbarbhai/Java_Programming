class ThreadDemo1
{
    public static void main(String A[])
    {
        System.out.println("Inside main method");

        String name= Thread.currentThread().getName();

        System.out.println("name of current is : "+name); // By default in main thread
    }
}