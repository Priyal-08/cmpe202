  

public class Main {
    
    public static void run()
    {
        int orderNumber = 0;
        Order order = new Order( ++orderNumber ) ;
        //Burger
        Burger burger = new Burger("LBB", 1);
        Toppings bacon = new Toppings("{{{{BACON}}}}",Placement.BOTTOMBUN);
        Toppings lettuce = new Toppings("LETTUCE",Placement.TOPBUN);
        Toppings tomato = new Toppings("TOMATO",Placement.TOPBUN);
        Toppings gOnion = new Toppings("G ONION",Placement.ONMEAT);
        Toppings jGrilled = new Toppings("JALA Grilled",Placement.ONMEAT);
        burger.addChild(bacon);
        burger.addChild(lettuce);
        burger.addChild(tomato);
        burger.addChild(gOnion);
        burger.addChild(jGrilled);
        
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
