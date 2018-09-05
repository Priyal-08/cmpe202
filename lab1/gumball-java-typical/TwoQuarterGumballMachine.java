import java.util.*;
public class TwoQuarterGumballMachine extends GumballMachine
{
    public TwoQuarterGumballMachine(int size)
    {
        // initialising base class instance variables
        super(size, 50, new ArrayList<Integer>(Arrays.asList(25)));
    }
    
    public void insertCoin(int coin)
    {
        System.out.println("Inserted Coin : " + coin);
        if(acceptedCoins.contains(coin))
        {
            has_total_amount += coin;
            if(has_total_amount == min_amount)
            {
                has_enough_coin = true;
            }
        }
        else
        {
            System.out.println("Invalid Coin");
            ejectInvalidCoin(coin);
        }
    }
    
    public void ejectInvalidCoin(int coin)
    {
        System.out.println("Please collect your coin worth: " + coin);
    }
    
    public void turnCrank()
    {
        System.out.println("Crank Turned");
        if(has_enough_coin)
        {
            if(num_gumballs > 0)
            {
                num_gumballs--;
                has_enough_coin = false;
                has_total_amount -= min_amount;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!" ) ;
                ejectCoin();
                has_total_amount -= min_amount;
                has_enough_coin = false;
            }
            
        }
        else
        {
            System.out.println("Insufficient funds. Total inserted amount : " + has_total_amount + ", required amount: " + min_amount + ". Please insert " + (min_amount - has_total_amount) + " amount.") ;
        }
        
    }
    
    public void ejectCoin()
    {
        System.out.println("Please collect your coin(s) worth: " + min_amount);
    }
}
