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
        StringBuffer topBunComponents = new StringBuffer();
        StringBuffer bottomBunComponents = new StringBuffer();
        StringBuffer onMeatComponents = new StringBuffer();
        for(IComponent c: components){
            switch(c.getPlacement()){
                case TOPBUN:
                    topBunComponents.append("   ");
                    topBunComponents.append(c.print());
                    topBunComponents.append("\n");
                    break;
                case BOTTOMBUN:
                    bottomBunComponents.append("   ");
                    bottomBunComponents.append(c.print());
                    bottomBunComponents.append("\n");
                    break;
                case ONMEAT:
                    onMeatComponents.append("   ");
                    onMeatComponents.append(c.print());
                    onMeatComponents.append("\n");
                    break;
                }
        }
        displayBurger.append(topBunComponents);
        displayBurger.append(onMeatComponents);
        displayBurger.append(bottomBunComponents);
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
