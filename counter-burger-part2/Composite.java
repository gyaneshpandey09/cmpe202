/**
 * Write a description of class Composite here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Composite implements Component
{
    // instance variables - replace the example below with your own
    protected ArrayList<Component> components = new ArrayList<Component>()  ;
    protected String description ;

    /**
     * Constructor for objects of class Composite
     */
    public Composite(String d)
    {
        description = d;
    }

    /**
     * Describes the burger
     */    
    public void printDescription(){
        System.out.println( description) ;
        for (Component obj: components)
        {
            obj.printDescription();
        }
    }
    
    public void addChild(Component c){
        components.add(c);
    }
    
    public void removeChild(Component c){
        components.remove(c);
    }
    
    public Component getChild(int i){
        return components.get(i);
    }
}
