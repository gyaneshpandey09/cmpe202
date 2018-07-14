
/**
 * Write a description of class CustomBurger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.text.DecimalFormat;
import java.util.ArrayList;


public class CustomBurger extends Composite
{
    // instance variables - replace the example below with your own
    PriceDecorator decorator = null ;

    /**
     * Constructor for objects of class CustomBurger
     */
    public CustomBurger(String d)
    {
        super(d);
    }

    public void setDecorator( PriceDecorator p ) {
        this.decorator = p ; 
    }
    
    public void printDescription() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println();
        System.out.println( description + " "+ fmt.format(decorator.getPrice()) );
        for (Component obj : components) {
            obj.printDescription(); 
        }
    }

}
