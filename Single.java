class Single
{
    public static void main(String Arg[])
    {
  //    Base bobj = new Base();         //No Casting
        Derived dobj = new Derived();   //No Casting
  //    Base bobj2 = new Derived();     //Up Casting
  //    Derived dobj2 = new Base();     //Down Casting NA

        dobj.fun();
        dobj.gun();

        System.out.println(dobj.A);
        System.out.println(dobj.B);
        System.out.println(dobj.X);
        System.out.println(dobj.Y);

    }
}

class Base
{
    public int A;
    public int B;

    public Base()
    {
        System.out.println("Inside Base Constructor");
        this.A = 11;
        this.B = 21;
    }

    public void fun()
    {
        System.out.println("Inside Base Fun");
    }

}

class Derived extends Base              //class Derived : public Base
{
    public int X;
    public int Y;

    public Derived()
    {
        System.out.println("Inside Derived Constructor");
        this.X = 51;
        this.Y = 101;
    }

    public void gun()
    {
        System.out.println("Inside Base Gun");
    }    
}
