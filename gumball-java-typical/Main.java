

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine1 = new GumballMachine(5);

		System.out.println(gumballMachine1);

		gumballMachine1.insertQuarter( 10 );
		gumballMachine1.turnCrank();

		System.out.println(gumballMachine1);

		gumballMachine1.insertQuarter( 25 );
		gumballMachine1.turnCrank();
		gumballMachine1.insertQuarter( 25 );
		gumballMachine1.turnCrank();

		System.out.println(gumballMachine1);
		System.out.println("----------------");
		
		GumballMachine gumballMachine2 = new GumballMachine(5,2);

		System.out.println(gumballMachine2);

		gumballMachine2.insertQuarter( 10 );
		gumballMachine2.turnCrank();

		System.out.println(gumballMachine2);

		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.turnCrank();

		System.out.println(gumballMachine2);
		System.out.println("----------------");
		
		GumballMachine gumballMachine3 = new GumballMachine(5,3);

		System.out.println(gumballMachine3);

		gumballMachine3.insertQuarter( 10 );
		gumballMachine3.turnCrank();

		System.out.println(gumballMachine3);

		gumballMachine3.insertQuarter( 25 );
		gumballMachine3.turnCrank();
		gumballMachine3.insertQuarter( 25 );
		gumballMachine3.turnCrank();

		System.out.println(gumballMachine3);
		System.out.println("----------------");
	}
}
