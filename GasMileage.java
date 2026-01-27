import java.util.Scanner;

public class GasMileage 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double totalMiles = 0.0;
        double totalGallon = 0.0;
        System.out.print("Enter miles driven (or -1 to quit )");
        int miles = input.nextInt();

        //sentinel - controlled loop

        while(miles != -1)
        {
            System.err.println("Enter gallons used ");
            int gallons = input.nextInt();

            // calculate MPG
            double milesPerGallon = (double)miles/gallons;
            System.out.printf("miles per gallon for this trip is: %.2f ",milesPerGallon);

            totalMiles += miles;
            totalGallon += gallons;

            double totalMilesPerGallon = (double)totalMiles/totalGallon;
            System.out.println("\nTotal miles per gallon: "+ totalMilesPerGallon);

                System.out.print("Enter miles driven (or -1 to quit )");
                miles = input.nextInt();

        }

        System.out.print("program terminated");
    }    
}
