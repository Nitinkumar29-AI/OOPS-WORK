// File name: ArithmeticApp.javaṇ
import java.util.Scanner;

public class ArithmeticApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input from user
        System.out.print("Enter first integer: ");
        int a = input.nextInt();

        System.out.print("Enter second integer: ");
        int b = input.nextInt();

        int sum = a + b;
        int product = a * b;
        int difference = a - b;

        // Output
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
        System.out.println("Difference = " + difference);

        if (b != 0) {
            int quotient = a / b;
            System.out.println("Quotient = " + quotient);
        } else {
            System.out.println("Quotient = Division by zero is not allowed");
        }
        input.close();
    }
}
