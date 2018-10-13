
import java.text.DecimalFormat;
/**
 * Order
 *
 * @author Priyal Agrawal
 * @version 1.0
 */
public class Order extends Composite
{
    private double total;
    private int orderNo;
    public Order ( int orderNo)
    {
        super("Order Number") ;
        this.orderNo = orderNo;
    }
    
    @Override
    public String printDescription() {
        String printDesc = "Order Number: " + this.orderNo;
        for (Component obj  : components)
        {
            printDesc += "\n" + obj.printDescription();
        }
        return printDesc;
    }
    
    /**
     * Return Order total
     * @return order total
     */
    @Override
    public double getPrice() {
        for (Component obj : components)
        {
            this.total += obj.getPrice();
        }
        return this.total;
    }
}

       