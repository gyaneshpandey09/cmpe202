

public class Main {

	public static void main(String[] args) {
	    
	    //Gumball Type 1 with only single quarters
		GumballMachine gumballMachine1 = new GumballMachine(5);

		System.out.println(gumballMachine1);

		gumballMachine1.insertCoins(10);
		gumballMachine1.turnCrank();

		System.out.println(gumballMachine1);

		gumballMachine1.insertCoins(50);
		gumballMachine1.turnCrank();
		gumballMachine1.insertCoins(20);
		gumballMachine1.turnCrank();

		System.out.println(gumballMachine1);
		System.out.println("------------- Type 1 End ------------");

		GumballMachine gumballMachine2 = new GumballMachine(5,2);

		System.out.println(gumballMachine2);

		gumballMachine2.insertCoins(10);
		gumballMachine2.turnCrank();

		System.out.println(gumballMachine2);

		gumballMachine2.insertCoins(50);
		gumballMachine2.turnCrank();
		gumballMachine2.insertCoins(20);
		gumballMachine2.turnCrank();

		System.out.println(gumballMachine2);
		System.out.println("------------- Type 2 End ------------");
		
		GumballMachine gumballMachine3 = new GumballMachine(5,3);

		System.out.println(gumballMachine3);

		gumballMachine3.insertCoins(10);
		gumballMachine3.turnCrank();

		System.out.println(gumballMachine3);

		gumballMachine3.insertCoins(50);
		gumballMachine3.turnCrank();
		gumballMachine3.insertCoins(20);
		gumballMachine3.turnCrank();

		System.out.println(gumballMachine3);
	}
}
