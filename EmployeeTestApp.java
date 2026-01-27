import java.util.Scanner;
class Employee
{
    private String Name;
    private String LastName;
    private double MonthlySalary;

    public Employee(String Name , String LastName , double MonthlySalary) 
    {
        this.Name = Name;
        this.LastName = LastName;

        if(MonthlySalary>0)
        {
            this.MonthlySalary = MonthlySalary;
        }
        else 
        {
            this.MonthlySalary=0.0;
        }
    }

    //setter defination 

    public void setName(String Name)
    {
        this.Name = Name;
    }
    public void SetLastName(String LastName)
    {
        this.LastName = LastName;
    }
    public void SetMonthlySalary(double MonthlySalary)
    {
        if(MonthlySalary>0)
        {
            this.MonthlySalary = MonthlySalary;
        }
    }

    // getter definition 

    public String getName()
    {
        return Name;
    }
    public String getLastName()
    {
        return LastName;
    }
    public double getMonthlySalary()
    {
        return MonthlySalary;
    }

    public double getYearlySalary() 
    {
        return MonthlySalary * 12;
    }
}
public class EmployeeTestApp {
    public static void main(String[]  args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name ");
        String Name = input.nextLine();
        System.out.println("Enter your Last name ");
        String LastName = input.nextLine();
        System.out.println("Enter Monthly salary");
        double MonthlySalary = input.nextDouble();

        Employee employee1 = new Employee( Name,LastName,MonthlySalary);

        System.out.println("Enter your first name ");
        String Name2 = input.nextLine();
        System.out.println("Enter your Last name ");
        String LastName2 = input.nextLine();
        System.out.println("Enter Monthly salary");
        double MonthlySalary2 = input.nextDouble();
        Employee employee2 = new Employee( Name2,LastName2,MonthlySalary2);

        System.out.println("\nYearly Salary Before Hike:\n");
        System.out.println(employee1.getName() + " " + employee1.getLastName() + ": " + employee1.getYearlySalary());
        System.out.println(employee2.getName() + " " + employee2.getLastName() + ": " + employee2.getYearlySalary());

        employee1.SetMonthlySalary(employee1.getMonthlySalary() * 1.10);
        employee2.SetMonthlySalary(employee2.getMonthlySalary() * 1.10);

        System.out.println("\nYearly Salary Before Hike:\n");
        System.out.println(employee1.getName() + " " + employee1.getLastName() + ": " + employee1.getYearlySalary());
        System.out.println(employee2.getName() + " " + employee2.getLastName() + ": " + employee2.getYearlySalary());
    }
}
