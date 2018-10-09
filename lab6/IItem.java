
/**
 * Five Guys Menu Items
 *
 * @author Priyal Agrawal
 * @version 1.0
 */
public interface IItem
{
    /**
     * Return item contents
     * @return item contents
     */
    String print();
    
    /**
     * Return item price
     * @return item price
     */
    double getPrice();
    
    /**
     * Add components to item
     * @param component
     */
    void addComponent(IComponent c);
}
