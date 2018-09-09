import java.util.*;
public class GumballMachine
{

    protected int num_gumballs;
    protected boolean has_enough_coin;
    protected int min_amount;
    protected int has_balance_amount;
    protected ArrayList<Integer> acceptedCoins;
    public GumballMachine(int size, int min_amount, ArrayList<Integer> acceptedCoins)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_enough_coin = false;
        this.min_amount = min_amount;
        this.has_balance_amount = 0;
        this.acceptedCoins = new ArrayList<Integer>(acceptedCoins);
    }

    public void insertCoin(int coin) {
        System.out.println("Inserted Coin : " + coin);
        if(!has_enough_coin)
        {
            if(acceptedCoins.contains(coin))
            {
                has_balance_amount += coin;
                if(has_balance_amount >= min_amount)
                {
                    has_enough_coin = true;
                }
            }
            else
            {
                System.out.println("Invalid Coin. Please collect your coin: " + coin + " cents");
            }
        }
        else
        {
            System.out.println("You can not insert another coin.");
        }
    }
    
    public void turnCrank() {
        System.out.println("Crank Turned");
        if(has_enough_coin)
        {
            if(num_gumballs > 0)
            {
                num_gumballs--;
                has_enough_coin = false;
                has_balance_amount -= min_amount;
                System.out.println( "Thanks for your coin.  Gumball Ejected!" ) ;
                if(has_balance_amount>0)
                {
                    System.out.println("Please collect the balance amount: " + has_balance_amount + " cents");
                    has_balance_amount = 0;
                }
            }
            else
            {
		System.out.println( "No More Gumballs!" ) ;
		ejectCoin();
		has_balance_amount = 0;
		has_enough_coin = false;
            }
        }
        else
        {
            System.out.println( "Please pay " + min_amount + " cents first. Total paid: " + has_balance_amount + " cents, Remaining: " + (min_amount - has_balance_amount) + " cents" ) ;
        }
    }
    
    public void ejectCoin() {
        System.out.println("Please collect your coin(s): " + has_balance_amount + " cents");
    }
    
    public String toString()
    {
        return String.format("Gumball machine has : " + this.num_gumballs + " gumballs. Cost of each gumball : " + min_amount + " cents. Amount inserted: " + has_balance_amount);
    }
}
