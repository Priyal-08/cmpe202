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

    public void insertCoin(int coin) {}
    
    public void turnCrank() {}
    
    public String toString()
    {
        return String.format("Gumball machine has : " + this.num_gumballs + " gumballs. Cost of each gumball : " + min_amount + " cents. Amount inserted: " + has_balance_amount);
    }
}
