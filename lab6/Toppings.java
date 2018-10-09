
/**
 * Burger components
 * 
 * @author Priyal Agrawal
 * @version 1.0
 */
public class Toppings implements IComponent
{
    private String description;
    private Placement place;
    
    public Toppings(String description, Placement place) {
        this.description = description;
        this.place = place;
    }
    /**
     * Return component's contents
     * @return component contents
     */
    public String print(){
        if(place == Placement.ONMEAT){
            return "->|" + description;
        } else {
            return description;
        }
    }
    
    /**
     * Return component's placement
     * @return component placment
     */
    public Placement getPlacement(){
        return place;
    }
}
