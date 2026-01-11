import java.util.Scanner;

public class SeperatingNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of digits five ");
        int num = input.nextInt();
        int[] arr = new int[5];
        for( int i =0 ; i< 5 ; i++)
        {
            int temp = num%10;
            arr[i] = temp;
            num = num/10;
        }
        for( int i = 0 ; i<5 ; i++)
        {
            System.out.print("   " + arr[i]);
        }
        
    }
}
