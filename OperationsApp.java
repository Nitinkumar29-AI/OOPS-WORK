import java.util.Scanner;

public class OperationsApp {
    public static void main(String[] args) 
    {
        Scanner input = new input(System.in);
        System.out.print("enter first number ");
        int num1 = input.nextInt();
        System.out.print("enter second number");
        int num2 = input.nextInt();
        System.out.print("enter third number");
        int num3 = input.nextInt();
        //summition
        int sum = (num1 + num2 + num3);
        System.out.println("summition is " + sum);
        float avg = sum/3;
        System.out.println("average is "+ avg);
        int product = (num1*num2*num3);
        System.out.println("product is " + product);
                
    }
}
