import java.util.ArrayList;
/**
 * Five Guys Menu Items-Burger
 *
 * @author Priyal Agrawal
 * @version 1.0
 */
public class Burger implements IItem
{
    private ArrayList<IComponent> components = new ArrayList<IComponent>();
    private double price;
    private String description;
    private int quantity;
    /**
     * Constructor for objects of class Burger
     */
    public Burger(String description, double price, int quantity)
    {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }
    
    /**
     * Return burger contents
     * @return burger contents
     */
    public String print() {
        StringBuffer displayBurger = new StringBuffer();
        displayBurger.append(quantity);
        displayBurger.append(" ");
        displayBurger.append(description);
        displayBurger.append("\t\t");
        displayBurger.append(price);
        displayBurger.append("\n");
        for(IComponent c: components){
            displayBurger.append("   ");
            displayBurger.append(c.print());
            displayBurger.append("\n");
        }
        return displayBurger.toString();
    }
    
    /**
     * Return item price
     * @return item price
     */
    public double getPrice(){
        return this.price;
    }
    
    public void addComponent(IComponent c){
        components.add(c);
    }
}
