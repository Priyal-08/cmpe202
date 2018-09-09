import java.util.*;
public class AnyCoinGumballMachine extends GumballMachine
{
    public AnyCoinGumballMachine(int size)
    {
        // initialising base class instance variables
        super(size, 50, new ArrayList<Integer>(Arrays.asList(5,10,25)));
    }
}
