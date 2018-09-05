public class Main {

    public static void main(String[] args) {
        
        System.out.println("\n-----Testing OneQuarterGumballMachine-----");
        GumballMachine oneQuarterGumballMachine = new OneQuarterGumballMachine(5);

        System.out.println(oneQuarterGumballMachine);

        oneQuarterGumballMachine.insertCoin( 25 );
        oneQuarterGumballMachine.turnCrank();

        System.out.println(oneQuarterGumballMachine);

        oneQuarterGumballMachine.insertCoin( 25 );
        oneQuarterGumballMachine.turnCrank();
        oneQuarterGumballMachine.insertCoin( 25 );
        oneQuarterGumballMachine.turnCrank();
        
        oneQuarterGumballMachine.insertCoin( 10 );
        oneQuarterGumballMachine.turnCrank();
        
        oneQuarterGumballMachine.insertCoin( 25 );
        oneQuarterGumballMachine.turnCrank();

        System.out.println(oneQuarterGumballMachine);
        oneQuarterGumballMachine.insertCoin( 25 );
        oneQuarterGumballMachine.turnCrank();
        oneQuarterGumballMachine.insertCoin( 25 );
        oneQuarterGumballMachine.turnCrank();
        
        
        System.out.println("\n-----Testing TwoQuarterGumballMachine-----");
        GumballMachine twoQuarterGumballMachine = new TwoQuarterGumballMachine(5);

        System.out.println(twoQuarterGumballMachine);

        twoQuarterGumballMachine.insertCoin( 25 );
        twoQuarterGumballMachine.turnCrank();

        System.out.println(twoQuarterGumballMachine);

        twoQuarterGumballMachine.insertCoin( 25 );
        twoQuarterGumballMachine.turnCrank();
        twoQuarterGumballMachine.insertCoin( 25 );
        twoQuarterGumballMachine.turnCrank();
        
        twoQuarterGumballMachine.insertCoin( 10 );
        twoQuarterGumballMachine.turnCrank();
        
        twoQuarterGumballMachine.insertCoin( 25 );
        twoQuarterGumballMachine.turnCrank();

        System.out.println(twoQuarterGumballMachine);
        twoQuarterGumballMachine.insertCoin( 25 );
        twoQuarterGumballMachine.turnCrank();
        twoQuarterGumballMachine.insertCoin( 25 );
        twoQuarterGumballMachine.turnCrank();
        
        System.out.println("\n-----Testing AnyCoinGumballMachine-----");
        GumballMachine anyCoinGumballMachine = new AnyCoinGumballMachine(5);

        System.out.println(anyCoinGumballMachine);

        anyCoinGumballMachine.insertCoin( 25 );
        anyCoinGumballMachine.turnCrank();

        System.out.println(anyCoinGumballMachine);

        anyCoinGumballMachine.insertCoin( 25 );
        anyCoinGumballMachine.turnCrank();
        anyCoinGumballMachine.insertCoin( 25 );
        anyCoinGumballMachine.turnCrank();
        
        anyCoinGumballMachine.insertCoin( 10 );
        anyCoinGumballMachine.turnCrank();
        
        anyCoinGumballMachine.insertCoin( 25 );
        anyCoinGumballMachine.turnCrank();

        System.out.println(anyCoinGumballMachine);
        anyCoinGumballMachine.insertCoin( 25 );
        anyCoinGumballMachine.turnCrank();
        anyCoinGumballMachine.insertCoin( 25 );
        anyCoinGumballMachine.turnCrank();
    }
}
