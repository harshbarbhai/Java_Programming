class ThreadPriority
{
    public static void main(String A[])
    {
        System.out.println("Inside main method");
        Thread tobj=Thread.currentThread();

        String name= tobj.getName();

        System.out.println("Name of current is : "+name); // By default in main thread
        int Priority = tobj.getPriority();

        System.out.println("priority of corrent a thread is:"+Priority);
        tobj.setPriority(10);//10 means high priority
        Priority = tobj.getPriority(); //if we use in it is redefination 

        System.out.println("priority of corrent thread is:"+Priority);
    }
}