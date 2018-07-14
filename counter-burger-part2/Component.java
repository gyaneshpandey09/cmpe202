
/**
 * Write a description of interface Burger here.
 *
 * @Gyanesh 
 * @v1.0
 */
public interface Component
{
    /**
     * Describes the burger
     */    
    void printDescription();
    void addChild(Component c);
    void removeChild(Component c);
    Component getChild(int index);
 
}
