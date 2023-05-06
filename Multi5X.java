
class Multi5X
{
    public static void main(String Arg[]) throws Exception
    {
        Marvellous mobj1 = new Marvellous();
        Marvellous mobj2 = new Marvellous();

        Thread t1 = new Thread(mobj1);
        Thread t2 = new Thread(mobj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("End of main Thread");
    }
}

class Marvellous implements Runnable
{
    public void run()
    {
        try
        {
            for(int i = 1; i < 10; i++)
            {
                System.out.println(i);
                Thread.sleep(1500);
            }
        }
        catch(InterruptedException obj)
        {}
    }
}