/**
 * Created by Ashlee on 28/09/2016.
 */
public class ItemSold
{
    private int invoiceNum;
    private String description;
    private double price;
    public void setInvoiceNum(int num)
    {
        invoiceNum = num;
    }
    public void setDescription(String desc)
    {
        description = desc;
    }
    public void setPrice(double pri)
    {
        price = pri;
    }
    public int getInvoiceNum()
    {
        return invoiceNum;
    }
    public String getDescription()
    {
        return description;
    }
    public double getPrice()
    {
        return price;
    }
}
