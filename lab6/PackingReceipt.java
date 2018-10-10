
/**
 * Packing Receipt
 *
 * @author Priyal Agrawal
 * @version 1.0
 */
public class PackingReceipt implements IReceiptStrategy
{
    
    /**
     * Constructor for objects of class PackingReceipt
     */
    public PackingReceipt()
    {
       
    }
    /**
     * Return receipt contents
     * @param Order to print packing receipt for
     * @return receipt contents
     */
    public String print(Order order){
        StringBuffer packingReceipt = new StringBuffer();
        packingReceipt.append("\n----------------------------------------\n");
        packingReceipt.append(order.getOrderDate());
        packingReceipt.append("\n");
        packingReceipt.append(order.print());
        packingReceipt.append("\n----------------------------------------\n");
        return packingReceipt.toString();
    }
}
