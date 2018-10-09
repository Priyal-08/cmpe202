
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
        Toppings tomato = new Toppings("TOMATO",Placement.TOPBUN);
        Toppings lettuce = new Toppings("LETTUCE",Placement.TOPBUN);
        Toppings gOnion = new Toppings("G ONION",Placement.ONMEAT);
        Toppings jGrilled = new Toppings("JALA Grilled",Placement.ONMEAT);
        Order order = new Order(++orderNo);
        IItem burger = new Burger("LBB", 5.59, 1);
        burger.addComponent(tomato);
        burger.addComponent(lettuce);
        burger.addComponent(gOnion);
        burger.addComponent(jGrilled);
        order.addItem(burger);
        System.out.println(order.print());
    }
}
