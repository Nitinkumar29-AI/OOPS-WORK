import java.util.Scanner;

public class CreditLimitApp 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the user Account number: ");
        int accNumber = input.nextInt();

        System.out.print("Enter the initial balance: ");
        double initialBalance = input.nextDouble();

        System.out.print("Enter the total charges of this month: ");
        double totalCharges = input.nextDouble();

        System.out.print("Enter the credits applied : ");
        double Credits = input.nextDouble();

        System.out.print("Enter the credit limit: ");
        double CreditLimit = input.nextDouble();

        double NewBalance = initialBalance + totalCharges - Credits;

        System.out.println("\nAccount Number: " + accNumber);
        System.out.println("New Balance: " + NewBalance);

        if(NewBalance>CreditLimit)
        {
            System.out.println("credit Limit Exceeded");
        }
        else 
        {
            System.out.println("credit Limit not Exceeded");
        }

    }    
}
