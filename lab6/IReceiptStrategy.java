
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
     * @param Order to print receipt for
     * @return receipt contents
     */
    String print(Order order);
}
