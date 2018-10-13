/**
 * Receipt strategy
 *
 * @author Priyal Agrawal
 * @version 1.0
 */
public interface IReceiptStrategy
{
    /**
     * Return receipt contents
     * @Component to be printed
     * @return receipt contents
     */
    void printDescription(Order order);
}