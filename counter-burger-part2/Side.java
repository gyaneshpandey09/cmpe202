
/**
 * Write a description of class Side here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Side extends LeafDecorator
{
    private String[] options;
    
    /**
     * Constructor for objects of class Side
     */
    public Side(String d)
    {
        super(d);
    }

    public void setOptions( String[] options ) {
        this.options = options ; 
        if ( options.length > 0)
            this.price += (options.length) * 3.00 ;
        //If someone checks No Side, there shouldn't be an extra $3 charge
        for ( int i = 0; i<options.length; i++ ){
            if ( "No Side".equals(options[i]) ) 
                this.price -= 3.00 ;
        }
    }

    public String getDescription() {
        String desc = "" ;
        for ( int i = 0; i<options.length; i++ ) 
        {
            if (i>0) 
                desc += " + " + options[i] ;
            else 
                desc = options[i] ; 
        }
        return desc ;
    }
}
