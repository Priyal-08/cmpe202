import java.text.DecimalFormat;
/**
 * Fries
 * 
 * @author Priyal Agrawal
 * @version 1.0
 */
public class Fries extends Leaf
{
    private double price;
    private int quantity;
    private int size;
    /**
     * Constructor for objects of class Fries
     */
    public Fries(String description, int size, int quantity)
    {
        super(description);
        this.size = size;
        this.quantity = quantity;
        this.setDetails();
    }
    
    private void setDetails(){
        switch(this.size){
            case 1:
                this.price = 2.79;
                break;
            case 2:
                this.price = 3.39;
                break;
            case 3:
                this.price = 5.59;
                break;
            default:
                this.price = 0.00;
        }
    }
    
    /**
     * Return component's contents
     * @return component contents
     */
    @Override
    public String printDescription() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        String printDesc = "\n " + quantity + " " + description + " " + fmt.format(getPrice());
        return printDesc;
    }
    
    /**
     * Return fries' price
     * @return fries' price
     */
    @Override
    public double getPrice(){
        return this.price * this.quantity;
    }
}