
/**
 * Components of Burger
 *
 * @author Priyal Agrawal
 * @version 1.0
 */
public interface IComponent
{
    /**
     * Return component's contents
     * @return component contents
     */
    String print();
    
    /**
     * Return component's placement
     * @return component placement
     */
    Placement getPlacement();
}
