import Marvellous.Mathematics;
import Marvellous.Arithmatic;
import Marvellous.*;

public class PackageDemo
{
    public static void main(String Arg[])
    {
        Arithmatic aobj = new Arithmatic();
        Mathematics mobj = new Mathematics();
        
        int iRet = 0;
        iRet = aobj.Addition(10,11);
        System.out.println("Addition is : "+iRet);

        iRet = aobj.Substraction(10,11);
        System.out.println("Substraction is : "+iRet);

        iRet = mobj.Square(10);
        System.out.println("Sqaure is : "+iRet);
        
        iRet = mobj.Cube(10);
        System.out.println("Sqaure is : "+iRet);
    }
}