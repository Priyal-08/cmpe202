

public class Main {

	public static void main(String[] args) {
		GumballMachine oneQuarterGumballMachine = new GumballMachine(5, MachineModel.OneQuarterModel);

		System.out.println(oneQuarterGumballMachine);

		oneQuarterGumballMachine.insertCoin(25);
		oneQuarterGumballMachine.turnCrank();

		System.out.println(oneQuarterGumballMachine);

		oneQuarterGumballMachine.insertCoin(25);
		oneQuarterGumballMachine.turnCrank();
		oneQuarterGumballMachine.insertCoin(25);
		oneQuarterGumballMachine.turnCrank();

		System.out.println(oneQuarterGumballMachine);
		
		GumballMachine twoQuarterGumballMachine = new GumballMachine(5, MachineModel.TwoQuarterModel);

		System.out.println(twoQuarterGumballMachine);

		twoQuarterGumballMachine.insertCoin(25);
		twoQuarterGumballMachine.turnCrank();

		System.out.println(twoQuarterGumballMachine);

		twoQuarterGumballMachine.insertCoin(25);
		twoQuarterGumballMachine.turnCrank();
		twoQuarterGumballMachine.insertCoin(25);
		twoQuarterGumballMachine.turnCrank();

		System.out.println(twoQuarterGumballMachine);
		
		GumballMachine anyCoinGumballMachine = new GumballMachine(5, MachineModel.AnyCoinModel);

		System.out.println(anyCoinGumballMachine);

		anyCoinGumballMachine.insertCoin(10);
		anyCoinGumballMachine.turnCrank();

		System.out.println(anyCoinGumballMachine);

		anyCoinGumballMachine.insertCoin(25);
		anyCoinGumballMachine.turnCrank();
		anyCoinGumballMachine.insertCoin(25);
		anyCoinGumballMachine.turnCrank();

		System.out.println(anyCoinGumballMachine);
	}
}
