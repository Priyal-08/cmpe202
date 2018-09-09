import java.util.*;

enum MachineModel {
    OneQuarterModel,
    TwoQuarterModel,
    AnyCoinModel
};

public class GumballMachine {
 
    State soldOutState;
    State noCoinState;
    State hasSufficientCoinState;
    State hasInsufficientCoinState;
    State soldState;
    State state = soldOutState;
    
    private int count = 0;
    private int minAmount;
    private int hasBalanceAmount;
    private ArrayList<Integer> acceptedCoins;
    private MachineModel machineModel;
    
    public GumballMachine(int numberGumballs, MachineModel model) {
        soldOutState = new SoldOutState(this);
        noCoinState = new NoCoinState(this);
        hasSufficientCoinState = new HasSufficientCoinState(this);
        hasInsufficientCoinState = new HasInsufficientCoinState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        this.hasBalanceAmount = 0;
        this.machineModel = model;
        if (numberGumballs > 0) {
            state = noCoinState;
        }
        switch(machineModel) {
            case OneQuarterModel:
                this.minAmount = 25;
                this.acceptedCoins = new ArrayList<Integer>(Arrays.asList(25));
            break;
            case TwoQuarterModel:
                this.minAmount = 50;
                this.acceptedCoins = new ArrayList<Integer>(Arrays.asList(25));
            break;
            case AnyCoinModel:
                this.minAmount = 50;
                this.acceptedCoins = new ArrayList<Integer>(Arrays.asList(5,10,25));
            break;
        }
    }
 
    public void insertCoin(int coin) {
        state.insertCoin(coin);
    }
 
    public void ejectCoin() {
        state.ejectCoin();
    }
 
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }
    
    public int getMinAmount() {
        return minAmount;
    }
    
    public int getBalanceAmount() {
        return hasBalanceAmount;
    }
    
    public ArrayList<Integer> getAcceptedCoinsList() {
        return acceptedCoins;
    }
    
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
        hasBalanceAmount -= minAmount;
    }
 
    int getCount() {
        return count;
    }
 
    void refill(int count) {
        this.count = count;
        state = noCoinState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasSufficientCoinState() {
        return hasSufficientCoinState;
    }
    
    public State getHasInsufficientCoinState() {
        return hasInsufficientCoinState;
    }

    public State getSoldState() {
        return soldState;
    }
    
    public void setBalanceAmount(int amount) {
        hasBalanceAmount = amount;
    }
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        switch(machineModel)
        {
            case OneQuarterModel:
                result.append("\nJava-enabled Standing Gumball Model #2004 (Accepts only quarters. Gumball price: 25 cents)");
            break;
            case TwoQuarterModel:
                result.append("\nJava-enabled Standing Gumball Model #2004 (Accepts only quarters. Gumball price: 50 cents)");
            break;
            case AnyCoinModel:
                result.append("\nJava-enabled Standing Gumball Model #2004 (Accepts nickels, dimes and quarters. Gumball price: 50 cents)");
            break;
        }
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
