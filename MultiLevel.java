class MultiLevel
{
    public static void main(String Arg[])
    {
  //    Base bobj = new Base();         //No Casting
        DerivedX dobj = new DerivedX();   //No Casting
  //    Base bobj2 = new Derived();     //Up Casting
  //    Derived dobj2 = new Base();     //Down Casting NA

        dobj.fun();
        dobj.gun();


        System.out.println(dobj.A); //11
        System.out.println(dobj.B); //21
        System.out.println(dobj.X); //51
        System.out.println(dobj.Y); //101
        System.out.println(dobj.Z); //111

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

class DerivedX extends Derived              //class Derived : public Base
{
    public int Z;

    public DerivedX()
    {
        System.out.println("Inside DerivedX Constructor");
        this.Z = 111;
    }
}
