/**
 * Burger components - Bacon
 * 
 * @author Priyal Agrawal
 * @version 1.0
 */
public class Bacon extends Leaf
{
    private Placement place;
    public Bacon(String description, Placement place) {
        super(description);
        this.place = place;
    }
    /**
     * Return Bacon's contents
     * @return bacon contents
     */
    @Override
    public String printDescription() {
        
        return "  {{{{" + description + "}}}}";
    }
    /**
     * Return bacon's placement
     * @return bacon placment
     */
    @Override
    public Placement getPlacement(){
        return place;
    }
}