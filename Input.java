import java.util.*;

class Input
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter Second Number : ");
        int iNo2 = sobj.nextInt();

        int iAns = 0;
        iAns = iNo1 + iNo2;
        System.out.println("Addition is : "+iAns);

    }
}

/*

Datatype     |      |       Method from Scanner Class
=================================================
boolean      |1 bit |       nextBoolean();
byte         |1 byte|       nextByte();
short        |2 byte|       nextShort();
int          |4 byte|       nextInt();
float        |4 byte|       nextFloat();
double       |8 byte|       nextDouble();
long         |8 byte|       nextLong();
string       |______|       nextLine();

*/