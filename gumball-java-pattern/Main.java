

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5,3);

		System.out.println(gumballMachine);

		gumballMachine.insertCoins(10);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertCoins(50);
		gumballMachine.turnCrank();
		gumballMachine.insertCoins(20);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
	}
}
