
public class GumballMachine
{

    private int num_gumballs;
    private boolean has_quarter;

    //Changed from quarter to coins
    private boolean has_enough_coins;

    //Variable for Machine Type. If mchn_type = 
    // 1: Works with Quarters only; 
    // 2: Costs 50 cents (2 quarters only); 
    // 3: Costs 50 censts (any coins)  
    private int mchn_type; 

    //Total sum of coins inserted
    private int sum;

    //Different error messages for different machine types
    private String error_type1 = "Please insert a quarter";
    private String error_type2 = "Please insert 2 quarters only!";
    private String error_type3 = "Please insert atleast 50 cents. (Don't expect change!)";

    public GumballMachine( int size)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
        this.mchn_type = 1;
    }

    public GumballMachine( int size, int machine_type)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
        this.mchn_type = machine_type;
    }

    public void insertQuarter(int coin)
    {
        if (mchn_type==1) {
            if ( coin == 25 )
                has_enough_coins = true;
            else 
                has_enough_coins = false;
            System.out.println( "Cents Inserted = " + coin) ;
        } else if (mchn_type==2){
            if ( coin == 25 ){
                this.sum += coin;
                if (this.sum == 50){
                    has_enough_coins = true;
                } else {
                    has_enough_coins = false;
                }                
            }
            System.out.println( "Cents Inserted = " + coin) ;
        } else if (mchn_type==3){
            this.sum += coin;
            if (this.sum >= 50){
                has_enough_coins = true;
            } else {
                has_enough_coins = false;
            }                
            System.out.println( "Cents Inserted = " + this.sum) ;
        }
    }
    
    public void turnCrank()
    {
    	if ( this.has_enough_coins )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.has_enough_coins = false ;
    			System.out.println( "Thank you. Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
            showError();
    	}        
    }

    public void showError(){
            String error_type;
            if (mchn_type == 1)
                error_type = error_type1;
            else if (mchn_type == 2)
                error_type = error_type2;
            else
                error_type = error_type3;

            System.out.println(error_type) ;        
    }

}
