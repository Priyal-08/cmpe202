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
        DecimalFormat fmt = new DecimalFormat("$0.00");
        System.out.println("\nBill receipt for customer\n");
        System.out.println("-------------------------------------\n");
        System.out.println("Order Number = " + order.getOrderNumber());
        for(int i=0; i<order.getOrderItems().size(); i++) {
            Component obj = order.getOrderItems().get(i);
            if(obj instanceof Burger){
                Burger b = (Burger)order.getOrderItems().get(i);
                System.out.println(b.printPriceDescription());
            } else if (obj instanceof Fries) {
                Fries f = (Fries)order.getOrderItems().get(i);
                System.out.println(f.printPriceDescription());
            }
        }
        System.out.println("  Sub. Total:\t\t" + fmt.format(order.getPrice()));
        System.out.println("-------------------------------------");
    }
}
