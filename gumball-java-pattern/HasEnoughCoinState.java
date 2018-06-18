
/**
 * Write a description of class HasEnoughCoinState here.
 *
 * @author Gyanesh Pandey
 * @version 1.0
 */
public class HasEnoughCoinState implements State
{
	GumballMachine gumballMachine;
 
	public HasEnoughCoinState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertCoins(int coins) {
		System.out.println("You can't insert more coins");
	}
 
	public void ejectCoins() {
		System.out.println("Coins returned");
		gumballMachine.setState(gumballMachine.getInsufficientCoinState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
    
}
