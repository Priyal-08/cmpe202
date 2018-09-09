import java.util.*;
public class TwoQuarterGumballMachine extends GumballMachine
{
    public TwoQuarterGumballMachine(int size)
    {
        // initialising base class instance variables
        super(size, 50, new ArrayList<Integer>(Arrays.asList(25)));
    }
}
