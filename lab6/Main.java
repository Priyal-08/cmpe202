
/**
 * Main Order class
 *
 * @author Priyal Agrawal
 * @version 1.0
 */
public class Main
{
    private static int orderNo;

    public Main()
    {
        orderNo = 0;
    }

    /**
     * Run the test cases for Order
     */
    public static void run()
    {
        IReceiptStrategy billReceipt = new BillReceipt();
        IReceiptStrategy packingReceipt = new PackingReceipt();
        Order order = new Order(++orderNo);
        
        //Burger
        Burger burger = new Burger("LBB", 1);
        Toppings lettuce = new Toppings("LETTUCE",Placement.TOPBUN);
        Toppings tomato = new Toppings("TOMATO",Placement.TOPBUN);
        Toppings gOnion = new Toppings("G ONION",Placement.ONMEAT);
        Toppings jGrilled = new Toppings("JALA Grilled",Placement.ONMEAT);
        burger.addComponent(lettuce);
        burger.addComponent(tomato);
        burger.addComponent(gOnion);
        burger.addComponent(jGrilled);
        
        //Fries
        Fries fries = new Fries("CAJ", 1, 1);
        
        //Add burger to order
        order.addItem(burger);
        //Add fries to order
        order.addItem(fries);
        
        System.out.println(billReceipt.print(order));
        System.out.println(packingReceipt.print(order));
    }
}
