import java.util.ArrayList;
/**
 * Five Guys Menu Items
 *
 * @author Priyal Agrawal
 * @version 1.0
 */
public class Order
{
   private int orderNumber;
   private ArrayList<IItem> items = new ArrayList<IItem>();
   private double total;
    public Order(int orderNo)
    {
        orderNumber = orderNo;
        total = 0;
    }
    
    /**
     * Get the order number
     * @return order number
     */
    public int getOrderNumber(){
        return this.orderNumber;
    }
    
    /**
     * Get the order number
     * @param ordered item
     */
    public void addItem(IItem item){
        this.items.add(item);
    }
    
    /**
     * Get the order number
     * @return order number
     */
    public double getOrderTotal(){
        for(IItem item: items){
            this.total += item.getPrice();
        }
        return this.total;
    }
    
    /**
     * Print Order
     * @return order contents
     */
    public String print(){
        StringBuffer displayOrder = new StringBuffer();
        displayOrder.append("Order Number: ");
        displayOrder.append(orderNumber);
        displayOrder.append("\n");
        for(IItem item: items){
            displayOrder.append(item.print());
            displayOrder.append("\n");
        }
        displayOrder.append("Sub. Total:");
        displayOrder.append("\t\t");
        displayOrder.append(getOrderTotal());
        return displayOrder.toString();
    }
    
}
