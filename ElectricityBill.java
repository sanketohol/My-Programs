import java.util.*;
class ElectricityBill
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);
        Customer cobj1 = new Customer();

        double billAmount1 = 0.0f;

        billAmount1 = cobj1.calculateBillAmount(300.5f);
        System.out.println("The Bill Amount is : "+billAmount1);

        
    }
}

class Customer
{
    String customerName;
    double unitsConsumed;
    double billAmount;

    public double calculateBillAmount(double unitsConsumed)
    {
        double billAmount = 0.0f;

        if (unitsConsumed <= 100)
        {
            billAmount = unitsConsumed * 5;
        }
        else if (unitsConsumed <= 300)
        {
            billAmount = 100 * 5 + (unitsConsumed-100) * 7;
        }
        else
        {
            billAmount = 100 * 5 + (unitsConsumed-100) * 7 + (unitsConsumed-300) * 10;
        }

        return billAmount;
    }
}