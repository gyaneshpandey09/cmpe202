
/**
 * Write a description of class InsufficientCoinState here.
 *
 * @author Gyanesh Pandey
 * @version 1.0
 */
public class InsufficientCoinState implements State 
{
    GumballMachine gumballMachine;
 
    public InsufficientCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertCoins(int coins) {
        
        if (gumballMachine.getMachineType() == 3){
            gumballMachine.sum += coins;
        } else if (gumballMachine.getMachineType() == 1 || gumballMachine.getMachineType() == 2){
            if (coins%25 == 0){
                gumballMachine.sum += coins;
            } else {            
                System.out.println(" Quarter Only Please!");
            }

        }
        
        System.out.println(gumballMachine.sum + " cents inserted");
        
        if (gumballMachine.sum >= gumballMachine.coin_limit)
            gumballMachine.setState(gumballMachine.getHasEnoughCoinState());
        else 
            gumballMachine.setState(gumballMachine.getInsufficientCoinState());
    }
 
    public void ejectCoins() {
        System.out.println("You haven't inserted enough coins");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but insufficient coins");
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
	} 
 
    public String toString() {
    		return "waiting for coins";
    }

}
