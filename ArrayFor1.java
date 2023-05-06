import java.util.*;

class ArrayFor
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Size of Array : ");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements : ");
        int iCnt = 0;

        //      1           2          3
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt(); //4
        }
        
        //      1          2          3
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.println("output is : "+Arr[iCnt]); //4
        }
    }
}