import java.util.Scanner;

class ThrowsDemo
{
    public static void main(String Arg[])
    {
        Demo obj = new Demo();
        float Ret = 0.0f;

        try
        {
        Ret = obj.Division(11,0);
        }
        catch(ArithmeticException aobj)
        {
            System.out.println("Exception Occured : "+aobj);
        }
        System.out.println("Division is : "+Ret);
    }
}

class Demo
{
    public float Division(int No1, int No2) throws ArithmeticException
    {
        return No1 / No2;
    }
}
