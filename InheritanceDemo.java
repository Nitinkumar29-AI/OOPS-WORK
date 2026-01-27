class figure
{
    public static final double PI = 3.145;
    double r;
    public double a;
    public double v;
    public void dispArea()
    {   
        System.out.println("area of cone: " + a);
    }
    public void dispVolume()
    {
            System.out.println("volume of cone: "+v);
    }
}
class cone extends figure
{
       double h;
       double s;
    
    public void CalcArea()
    {
        
        h = (PI*r*s) + (PI*r*s);
        a=h;
        
    }
  
    public void CalcVolume()
    {
        s=(PI*r*s)/3;
        v=s;
    }
}
public class InheritanceDemo 
{
    public static void main(String[] args)
    {
        cone c = new cone();
        c.h = 10;
        c.s = 36;
        c.r = 25;

        c.CalcArea();
        c.CalcVolume();

        c.dispVolume();
        c.dispArea();
    }
}
