import java.text.DecimalFormat;
/**
 * Packing Receipt
 *
 * @author Priyal Agrawal
 * @version 1.0
 */
public class BillReceipt implements IReceiptStrategy
{
    
    /**
     * Constructor for objects of class PackingReceipt
     */
    public BillReceipt()
    {
       
    }
    /**
     * Return receipt contents
     * @param Order to print packing receipt for
     * @return receipt contents
     */
    public void printDescription(Order order){
        System.out.println("\n\nBill receipt for customer\n");
        System.out.println("-------------------------------------");
        DecimalFormat fmt = new DecimalFormat("$0.00");
        System.out.println(order.printDescription());
        System.out.println("  Sub. Total:\t\t" + fmt.format(order.getPrice()));
        System.out.println("-------------------------------------");
    }
}
