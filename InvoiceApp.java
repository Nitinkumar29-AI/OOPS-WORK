import java.util.Scanner;

class Invoice
{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber,String partDescription,int quantity,double pricePerItem)
    {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        if(quantity > 0)
        {
            this.quantity = quantity;
        }
        else 
        {
            this.quantity=0;
        }
        if(pricePerItem>0)
        {
            this.pricePerItem = pricePerItem;
        }
        else{
            this.pricePerItem = 0.0;
        }
    }
    public void SetpartNumber(String partNumber)
    {
        this.partNumber = partNumber;
    }
    public void SetpartDescription(String partDescription)
    {
        this.partDescription = partDescription;
    }
    public void SetQuantity(int quantity)
    {
        if(quantity>0)
        {
            this.quantity=quantity;
        }
        else 
        {
            this.quantity=0;
        }
    }
    public void SetPricePerItem(double pricePerItem)
    {
        if(pricePerItem>0)
        {
            this.pricePerItem=pricePerItem;
        }
        else
        {
            this.pricePerItem=0.0;
        }
    }
    public String getPartNumber()
    {
        return partNumber;
    }
    public String getPartDescription()
    {
        return partDescription;
    }
    public int getquantity()
    {
        return quantity;
    }
    public double getPricePerItem()
    {
        return pricePerItem;
    }
    public double getInvoiceAmount()
    {
             return quantity*pricePerItem;
    }
}
public class InvoiceApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of your part ");
        String partNumber = input.nextLine();

        System.out.print("Enter part description  ");
        String partDescription = input.nextLine();

        System.out.print("Enter the Quantity part  ");
        int quantity = input.nextInt();

        System.out.print("Enter the prize ");
        double pricePerItem = input.nextDouble();

        Invoice invoice = new Invoice (partNumber,partDescription,quantity,pricePerItem);

        //output
        System.out.println("\n\nPart Number: "+ invoice.getPartNumber());
        System.out.println("Part Description: "+ invoice.getPartDescription());
        System.out.println("Quantity: "+ invoice.getquantity());
        System.out.println("Price Per Item: "+ invoice.getPricePerItem());
        System.out.println("Invoice Amount: "+ invoice.getInvoiceAmount());
        //setting valuees 
        invoice.SetQuantity(-5);
        invoice.SetPricePerItem(-12323);


        //again output to see the change in it 

        System.out.println("\n\nAfter setting invalid values:\n");
        System.out.println("Part Number: "+ invoice.getPartNumber());
        System.out.println("Part Description: "+ invoice.getPartDescription());
        System.out.println("Quantity: "+ invoice.getquantity());
        System.out.println("Price Per Item: "+ invoice.getPricePerItem());
        System.out.println("Invoice Amount: "+ invoice.getInvoiceAmount()); 
    }
}
