import java.util.Scanner; 

public class AreaOfCircle {
   public static void main(String[] args) {
    final double PI = 3.14159;
       Scanner input = new Scanner(System.in);
       System.out.println("enter the radius of the circle ");
       int radius = input.nextInt();
       //calculation of diameter 
       int diameter = 2*radius;
       double circumference = 2*PI*radius;
       double area = PI*radius*radius;
       //output 
       System.out.println("your diameter of the circle is  " + diameter);
       System.out.println("your circumference of the circle is  " + circumference);
       System.out.println("your area of the circle is  " + area);
   }    
}
