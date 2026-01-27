import java.utit.Scanner;

public class ParkingCost
{
    public static void main(string[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the Hrs that car parked: ");
        int HrsParked = input.nextInt();
        double bill;
        if(HrsParked > 3)
        {
            bill = 2 + ((HrsParked-3)*0.50);
        }
        else 
        {
            bill = 2
        }
        System.out.println("this coustomer bill is " + bill);
    }
}