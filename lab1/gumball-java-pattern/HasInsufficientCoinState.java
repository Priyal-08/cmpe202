

import java.util.Random;

public class HasInsufficientCoinState implements State {
    GumballMachine gumballMachine;
 
    public HasInsufficientCoinState(GumballMachine gumballMachine) {
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
            gumballMachine.setBalanceAmount(coin + gumballMachine.getBalanceAmount());
            if(gumballMachine.getMinAmount() <= gumballMachine.getBalanceAmount())
            {
                gumballMachine.setState(gumballMachine.getHasSufficientCoinState());
            }
        }
        else
        {
            System.out.println("You inserted an invalid coin. The coin is ejected back, please collect.");
        }
    }
 
    public void ejectCoin() {
        System.out.println("Coin returned: " + gumballMachine.getBalanceAmount() + " cents");
        gumballMachine.setBalanceAmount(0);
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there's not sufficient coins");
    }

    public void dispense() {
        System.out.println("You need to pay full amount first");
    }
 
    public String toString() {
        return "waiting for coin";
    }
}
