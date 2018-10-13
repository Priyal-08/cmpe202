  

public class Main {
    
    public static void run()
    {
        int orderNumber = 0;
        Order order = new Order( ++orderNumber ) ;
        //Burger
        Burger burger = new Burger("LBB", 1);
        Toppings lettuce = new Toppings("LETTUCE",Placement.TOPBUN);
        Toppings tomato = new Toppings("TOMATO",Placement.TOPBUN);
        Toppings gOnion = new Toppings("G ONION",Placement.ONMEAT);
        Toppings jGrilled = new Toppings("JALA Grilled",Placement.ONMEAT);
        Bacon bacon = new Bacon("BACON",Placement.BOTTOMBUN);
        burger.addChild(lettuce);
        burger.addChild(tomato);
        burger.addChild(gOnion);
        burger.addChild(jGrilled);
        burger.addChild(bacon);
        
        //Fries
        Fries fries = new Fries("LTL CAJ", 1, 1);
        //Add burger to order
        order.addChild(burger);
        //Add fries to order
        order.addChild(fries);
        
        PackingReceipt packReceipt = new PackingReceipt();
        packReceipt.printDescription(order);
        BillReceipt billReceipt = new BillReceipt();
        billReceipt.printDescription(order);
        
        
    }

}
