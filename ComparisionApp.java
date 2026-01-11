import java.util.Scanner;
public class ComparisionApp 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in); 

        System.out.print("enter first number ");
        int num1 = input.nextInt();
        System.out.print("enter second number ");
        int num2 = input.nextInt();
        if(num1>num2)
        {
            System.out.println("NUMBER 1 is larger " + num1);
        }
        else if(num2>num1)
        {
            System.out.println("NUMBER 2 is larger " + num2);
        }
        else if(num1==num2)
        {
            System.out.println("both the numbers are equal " );
        }
        else 
        {
            System.out.println("invalid input try again");
        }
    }    
}
