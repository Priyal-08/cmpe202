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
        billReceipt.append("         FIVE GUYS\n");
        billReceipt.append("      BURGERS AND FRIES\n");
        billReceipt.append("       STORE # CA-1294\n");
        billReceipt.append("     5353 ALMADEN EXPY N60\n");
        billReceipt.append("       SAN JOSE, CA 95118\n");
        billReceipt.append("        (P) 408-264-9300\n\n");
        billReceipt.append("       ");
        billReceipt.append(order.getOrderDate());
        billReceipt.append("\n        FIVE GUYS\n");
        billReceipt.append(order.print());
        billReceipt.append("\n----------------------------------------\n");
        return billReceipt.toString();
    }
}
