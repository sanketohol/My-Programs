import java.util.*;
class Book
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);
        Book1 bobj = new Book1();

        System.out.println("Enter title of the book");
        bobj.setTitle(sc.nextLine());
        System.out.println("Enter name of the author of the book.");
        bobj.setAuthor(sc.nextLine());
        System.out.println("Enter the name of the publisher of the book.");
        bobj.setPublisher(sc.nextLine());
        System.out.println("Enter the ISBN number of the book");
        bobj.setIsbn(sc.nextLine());
        System.out.println("Enter the year in which the book was published.");
        bobj.setYear(sc.nextInt());

        String title = bobj.getTitle();
        String author = bobj.getAuthor();
        String publisher = bobj.getPublisher();
        String isbn = bobj.getIsbn();
        int year = bobj.getYear();

        System.out.println("choose option :");
        System.out.println("1. Increase quantity of book");
        System.out.println("2. Decrease quantity of book");

        int num = sc.nextInt();
        switch(num){
        case 1: bobj.IncreaseQuantity(); break;
        case 2: bobj.DecreaseQuantity(); break;
        }
    }
}

class Book1
{
    public String title;
    public String author;
    public String publisher;
    public String isbn;
    public int year;
    public double price;
    public int quantity;
    public int books = 0;
    Scanner sc = new Scanner(System.in);

    public Book1()
    {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
    }

    public String getTitle()
    {
        return this.title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return this.author;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getPublisher()
    {
        return this.publisher;
    }
    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public String getIsbn()
    {
        return this.isbn;
    }
    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public int getYear()
    {
        return this.year;
    }
    public void setYear(int year)
    {
        this.year = year;
    }

    public double getPrice()
    {
        return this.price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }

    public int getQuantity()
    {
        return this.quantity;
    }
    public void setQantity(int quantity)
    {
        this.quantity = quantity;
    }

    public void IncreaseQuantity(){
        System.out.println("Enter the quantity to be increased");
        int x = sc.nextInt();
        System.out.println("Total number of books :"+(x+books)); 
        System.out.println("Total cost of book is :"+(x+books)*200);     
    }

    public void DecreaseQuantity(){
        System.out.println("Enter the quantity to be decreased");
        int x = sc.nextInt();
        System.out.println("Total number of books :"+(books-x)); 
        System.out.println("Total cost of book is :"+(books-x)*200);      
    }

}
