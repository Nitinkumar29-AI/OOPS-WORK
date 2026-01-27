import java.util.Scanner;

public class CarPoolingApp{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("enter the total miles driven per day : ");
        float MilesDriven = input.nextFloat();     
        System.out.print("enter the total miles per gallon : ");
        float MilesPerGallon = input.nextFloat();
        System.out.print("enter the cost per gallon : ");
        float CostPerGallon = input.nextFloat();
        System.out.print("enter the tool fee of the day : ");
        float ToolPerDay = input.nextFloat();
        System.out.print("enter the average fee per day : ");
        float AvgFee = input.nextFloat();
        float Fuelcost;
        Fuelcost = (MilesDriven/MilesPerGallon)*CostPerGallon;
        float CostFinal;
        CostFinal = Fuelcost + ToolPerDay + AvgFee;
        System.out.println("fuel cost per day of the user " + Fuelcost);   
        System.out.println("users cost per day driving to work is " + CostFinal);

    }
}