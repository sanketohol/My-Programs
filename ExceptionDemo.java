import java.util.Scanner;

class ExceptionDemo
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int No1 = 0, No2 = 0;
        float Ans = 0.0f;

        System.out.println("Enter First Number : ");
        No1 = sobj.nextInt(); 

        System.out.println("Enter Second Number : ");
        No2 = sobj.nextInt();    

        Ans = No1 / No2;

        System.out.println("Division is : "+Ans);
    }
}