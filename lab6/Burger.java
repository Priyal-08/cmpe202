import java.util.ArrayList;
import java.text.DecimalFormat;
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
    private boolean bacon;
    /**
     * Constructor for objects of class Burger
     */
    public Burger(String description, int quantity)
    {
        this.description = description;
        this.quantity = quantity;
        this.bacon = false;
        this.setDetails();
    }
    
    private void setDetails(){
        switch(this.description){
            case"HB":
                this.price = 6.39;
                break;
            case"CB":
                this.price = 7.19;
                break;
            case"BB":
                this.price = 7.19;
                this.bacon = true;
                break;
            case"BCB":
                this.price = 7.79;
                this.bacon = true;
                break;
            case"LHB":
                this.price = 4.59;
                break;
            case"LCB":
                this.price = 5.29;
                break;
            case"LBB":
                this.price = 5.59;
                this.bacon = true;
                break;
            case"LBCB":
                this.price = 6.19;
                this.bacon = true;
                break;
            default:
                this.price = 0.00;
        }
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
        DecimalFormat fmt = new DecimalFormat("0.00");
        displayBurger.append(fmt.format(getPrice()));
        displayBurger.append("\n");
        if(this.bacon) {
            displayBurger.append("  ");
            displayBurger.append("{{{{BACON}}}}");
            displayBurger.append("\n");
        }
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
     * Return burger price
     * @return burger price
     */
    public double getPrice(){
        return this.price * this.quantity;
    }
    
    public void addComponent(IComponent c){
        components.add(c);
    }
}
