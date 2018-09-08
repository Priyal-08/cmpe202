

public class NoCoinState implements State {
    GumballMachine gumballMachine;
 
    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertCoin(int coin) {
        if(gumballMachine.getAcceptedCoinsList().contains(coin))
        {
            switch(coin)
            {
                case 5: System.out.println("You inserted a nickel");
                break;
                case 10: System.out.println("You inserted a dime");
                break;
                case 25: System.out.println("You inserted a quarter");
                break;
            }
            gumballMachine.setBalanceAmount(coin);
            if(gumballMachine.getMinAmount() <= coin)
            {
                gumballMachine.setState(gumballMachine.getHasSufficientCoinState());
            }
            else
            {
                gumballMachine.setState(gumballMachine.getHasInsufficientCoinState());
            }
        }
        else
        {
            System.out.println("You inserted an invalid coin. The coin is ejected back, please collect.");
        }
    }
 
    public void ejectCoin() {
        System.out.println("You haven't inserted coin");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there's no coin");
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "waiting for coin";
    }
}
