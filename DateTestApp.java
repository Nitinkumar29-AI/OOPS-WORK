import java.util.Scanner;

class Date
{
    private int month;
    private int date;
    private int year;

    public Date(int month , int date  , int year)
    {
        this.month = month;
        this.date = date;
        this.year = year;
        
    }

    //setter definition

    public void setmonth(int month)
    {
            this.month=month;
    }
    
    public void setdate(int date)
    {
        this.date = date;
    }

    public void setyear(int year )
    {
        this.year = year;
    }

    //getter definition 

    public int getMonth()
    {
        return month;
    }
    public int getDate()
    {
        return date;
    }
    public int getyear()
    {
        return year;
    }

    // display time function 

    public void displayTime()
    {
        System.out.print(month+ "/" + date + "/" + year);
    }

}
public class DateTestApp
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month ");
        int month1 = input.nextInt();

        System.out.print("Enter the date ");
        int day1 = input.nextInt();

        System.out.print("Enter the year ");
        int year1 = input.nextInt();

        Date date1 = new Date(month1,day1,year1);

        System.out.print("Enter the month ");
        int month2 = input.nextInt();

        System.out.print("Enter the date ");
        int day2 = input.nextInt();

        System.out.print("Enter the year ");
        int year2 = input.nextInt();

        Date date2 = new Date(month2,day2,year2);

        System.out.print("\n DATE 1 : ");
        date1.displayTime();

        System.out.print("\n DATE 2 : ");
        date2.displayTime();



    }
    

}