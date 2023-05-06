
class FinalizeDemo
{
    public static void main (String Arr[])
    {
        Marvellous mobj1 = new Marvellous();
        Marvellous mobj2 = new Marvellous(11,21);

        mobj1 = null;
        mobj2 = null;
        System.gc();
    }
}

class Marvellous
{
    public int No1;
    public int No2;

    public Marvellous()
    {
        System.out.println("Inside Default Constructor");
        No1 = 0;
        No2 = 0;
    }
    public Marvellous(int A, int B)
    {
        System.out.println("Inside Parameterised Constructor");
        No1 = A;
        No2 = B;
    }
    protected void finalize()
    {
        System.out.println("Inside Finalize Method");
    }
}