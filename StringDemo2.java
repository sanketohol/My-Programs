
class StringDemo
{
    public static void main (String Arg[])
    {
        String str1 = "Hello";
        String str2 = new String("Hello");
        
        if(str1 == str2)
        {
            System.out.println("Strings are Equal");
        }
        else
        {
            System.out.println("Strings are Not Equal");
        }

        if(str1.equals(str2))
        {
            System.out.println("Strings are Equal");
        }
        else
        {
            System.out.println("Strings are Not Equal");
        }
    }
}
