
/**
 * Write a description of class Toppings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Toppings extends LeafDecorator {
    private String[] options ;
    public Toppings( String d ) {
        super(d) ; 
    }
    
    // 4 toppings free, extra topping +0.75 
    public void setOptions( String[] options ) {
        this.options = options ; 
    }

    public String getDescription(){
        String desc = "" ;
        for ( int i = 0; i<options.length; i++ ) {
            if (i>0) 
                desc += " + " + options[i] ; 
            else 
                desc = options[i] ;
        }
        return desc ;
    }
}
