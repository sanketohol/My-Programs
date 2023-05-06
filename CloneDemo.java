
class CloneDemo
{
    public static void main (String Arr[])
    {
        try
        {
        Student obj1 = new Student("Amit",87,27);
        Student obj2 = (Student)obj1.clone();

        System.out.println("Name : "+obj1.name);
        System.out.println("Marks : "+obj1.marks);
        System.out.println("Age : "+obj1.age);

        System.out.println("Name : "+obj2.name);
        System.out.println("Marks : "+obj2.marks);
        System.out.println("Age : "+obj2.age);
        }
        catch(Exception obj)
        {
            
        }
    }
}

class Student implements Cloneable
{
    public String name;
    public int marks;5
    public int age;

    public Student(String str, int a, int b)
    {
        this.name = str;
        this.marks = a;
        this.age = b;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}