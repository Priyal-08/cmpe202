
import java.text.DecimalFormat;

public class Burger extends Composite
{
    private double price;
    private int quantity;
    public Burger ( String d, int quantity )
    {
        super(d) ;
        this.quantity = quantity;
        setDetails();
    }
    
    private void setDetails(){
        switch(description){
            case"HB":
                this.price = 6.39;
                break;
            case"CB":
                this.price = 7.19;
                break;
            case"BB":
                this.price = 7.19;
                break;
            case"BCB":
                this.price = 7.79;
                break;
            case"LHB":
                this.price = 4.59;
                break;
            case"LCB":
                this.price = 5.29;
                break;
            case"LBB":
                this.price = 5.59;
                break;
            case"LBCB":
                this.price = 6.19;
                break;
            default:
                this.price = 0.00;
        }
    }
    @Override
    public String printDescription() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        String printDesc = "\n " + quantity + " " + description + " " + fmt.format(getPrice()) + "\n";
        StringBuffer topBunComponents = new StringBuffer();
        StringBuffer bottomBunComponents = new StringBuffer();
        StringBuffer onMeatComponents = new StringBuffer();
        for (Component obj  : components)
        {
            if(obj.getPlacement() == Placement.TOPBUN)
                topBunComponents.append("  " + obj.printDescription() + "\n");
            else if(obj.getPlacement() == Placement.ONMEAT)
                onMeatComponents.append("  " + obj.printDescription() + "\n");
            else
                bottomBunComponents.append("  " + obj.printDescription() + "\n");
        }
        printDesc += topBunComponents.toString();
        printDesc += onMeatComponents.toString();
        printDesc += bottomBunComponents.toString();
        return printDesc;
    }
    
    /**
     * Return burger price
     * @return burger price
     */
    @Override
    public double getPrice() {
        return this.quantity*this.price;
    }
}

       