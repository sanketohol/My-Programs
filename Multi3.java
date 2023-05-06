
class Multi3
{
    public static void main(String Arg[])
    {
        Thread t = Thread.currentThread();
        System.out.println("The name of current Thread is :" +t.getName());
        System.out.println("The Priority of current Thread is :" +t.getPriority());
    }
}
