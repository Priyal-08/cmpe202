import java.util.ArrayList;
import java.text.DecimalFormat;
/**
 * Five Guys Menu Items-Fries
 *
 * @author Priyal Agrawal
 * @version 1.0
 */
public class Fries implements IItem
{
    private double price;
    private String description;
    private int quantity;
    private String style;
    private int size;
    /**
     * Constructor for objects of class Fries
     */
    public Fries(String style, int size, int quantity)
    {
        this.style = style;
        this.size = size;
        this.quantity = quantity;
        this.setDetails();
    }
    
    private void setDetails(){
        switch(this.size){
            case 1:
                this.price = 2.79;
                this.description = "LTL ";
                break;
            case 2:
                this.price = 3.39;
                this.description = "REG ";
                break;
            case 3:
                this.price = 5.59;
                this.description = "LRG ";
                break;
            default:
                this.price = 0.00;
        }
        this.description += this.style;
    }
    /**
     * Return burger contents
     * @return burger contents
     */
    public String print() {
        StringBuffer displayFries = new StringBuffer();
        displayFries.append(quantity);
        displayFries.append(" ");
        displayFries.append(description);
        displayFries.append("\t\t");
        DecimalFormat fmt = new DecimalFormat("0.00");
        displayFries.append(fmt.format(getPrice()));
        displayFries.append("\n");
        return displayFries.toString();
    }
    
    /**
     * Return fries' price
     * @return fries' price
     */
    public double getPrice(){
        return this.price * this.quantity;
    }
}
