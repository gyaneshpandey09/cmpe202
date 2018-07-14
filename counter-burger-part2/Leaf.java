
/**
 * Write a description of class Leaf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.text.DecimalFormat;

public class Leaf implements Component
{
    // instance variables - replace the example below with your own
    protected Double price;
    private  String description;

    /**
     * Constructor for objects of class Leaf
     */
    public Leaf(String d)
    {
        // initialise instance variables
        description = d;
        price = 0.0;
    }

    public Leaf(String d, Double p)
    {
        // initialise instance variables
        description = d;
        price = p;
    }

    
    /**
     * Describes the burger
     */    
    public void printDescription(){
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println( description + " " + fmt.format(price) ) ;
    }
    
    /**
     * Returns the cost of the burger
     */    
    public double getCost(){
        return price;
    }
    
    public void addChild(Component c){
    // do nothing
    }
    
    public void removeChild(Component c){
    //do nothing
    }
    
    public Component getChild(int index){
    return null;
    }
}
