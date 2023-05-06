class SuperDemo
{
    public static void main(String Arg[])
    {
        Derived dobj = new Derived();   //No Casting

        dobj.gun();

    }
}

class Base
{
    public int A;
    public Base()
    {
        System.out.println("Inside BaseD Constructor");
        this.A = 11;
    }
    public Base(int i)
    {
        System.out.println("Inside BaseP Constructor");
        this.A = i;
    }
    public void fun()
    {
        System.out.println("Inside Base Fun");
    }

}

class Derived extends Base
{
    public int X;
    public Derived()
    {
        super(11);
        System.out.println("Inside Derived Constructor");
        this.X = 51;
    }

    public void gun()
    {
        System.out.println("Inside Derived Gun");
        System.out.println("Value of A : "+A);          //51
        System.out.println("Value of A : "+this.A);     //51
        System.out.println("Value of A : "+super.A);    //11
        super.fun();                                
    }    
}




// 1.   Access Characteristics of parent from child
// 2.   Call Method of parent from child
// 3.   Call constructor of parent from child