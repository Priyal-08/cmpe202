
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
    public void printDescription(Order order){
        System.out.println("\nPacking Receipt\n");
        System.out.println("-------------------------------------");
        System.out.println("Order Number = " + order.getOrderNumber());
        for(Component item : order.getOrderItems()) {
            System.out.println(item.printDescription());
        }
        System.out.println("-------------------------------------");
    }
}
