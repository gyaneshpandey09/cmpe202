

public class GumballMachine {
 
    State soldOutState;
    State insufficientCoinState;
    State hasEnoughCoinState;
    State soldState;
 
    State state = soldOutState;
    int count = 0;
    
    int machine_type = 0; // Type of Machine
    int coin_limit = 0; // Coin limit at which to eject the Gumball
    int sum = 0; // Sum of total coins inserted
 
    public GumballMachine(int numberGumballs, int type) {
        soldOutState = new SoldOutState(this);
        insufficientCoinState = new InsufficientCoinState(this);
        hasEnoughCoinState = new HasEnoughCoinState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = insufficientCoinState;
        }
        
        this.machine_type = type;
        
        if (machine_type == 1)
            coin_limit=25;
        if (machine_type == 2)
            coin_limit=50;
        if (machine_type == 3)
            coin_limit=50;
        
    }
 
    public void insertCoins(int coins) {
        state.insertCoins(coins);
    }
 
    public void ejectCoins() {
        state.ejectCoins();
    }
 
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }
 
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
        if (this.sum !=0){
            this.sum = 0;
        }
    }
 
    int getCount() {
        return count;
    }
 
    int getSum() {
        return sum;
    }
 
    int getCoinLimit() {
        return coin_limit;
    }

    int getMachineType() {
        return machine_type;
    }
 
    void refill(int count) {
        this.count = count;
        state = insufficientCoinState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getInsufficientCoinState() {
        return insufficientCoinState;
    }

    public State getHasEnoughCoinState() {
        return hasEnoughCoinState;
    }

    public State getSoldState() {
        return soldState;
    }
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
