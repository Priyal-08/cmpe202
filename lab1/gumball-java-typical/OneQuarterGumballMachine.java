import java.util.*;
public class OneQuarterGumballMachine extends GumballMachine
{
    public OneQuarterGumballMachine(int size)
    {
        // initialising base class instance variables
        super(size, 25, new ArrayList<Integer>(Arrays.asList(25)));
    }
}
