import java.text.DecimalFormat;
/**
 * Bill Receipt for Customer
 *
 * @author Priyal Agrawal
 * @version 1.0
 */
public class BillReceipt implements IReceiptStrategy
{
    /**
     * Constructor for objects of class BillReceipt
     */
    public BillReceipt()
    {
        
    }

    /**
     * Return receipt contents
     * @param Order to print Bill receipt for
     * @return receipt contents
     */
    public String print(Order order){
        StringBuffer billReceipt = new StringBuffer();
        billReceipt.append("\n----------------------------------------\n");
        billReceipt.append(order.getOrderDate());
        billReceipt.append("\n");
        billReceipt.append(order.print());
        billReceipt.append("Sub. Total:");
        billReceipt.append("\t\t$");
        DecimalFormat fmt = new DecimalFormat("0.00");
        billReceipt.append(fmt.format(order.getOrderTotal()));
        billReceipt.append("\n----------------------------------------\n");
        return billReceipt.toString();
    }
}
