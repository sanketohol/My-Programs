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

        int iCnt = 0;                       //1
        while(iCnt < iSize)                 //2
        {
            Arr[iCnt] = sobj.nextInt();     //4
            iCnt++;                         //3
        }
        
        iCnt = 0;
        while(iCnt < iSize)
        {
            System.out.println("output is : "+Arr[iCnt]); //4
            iCnt++;
        }
    }
}