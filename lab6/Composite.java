   

import java.util.ArrayList;

public class Composite implements Component {

    protected ArrayList<Component> components = new ArrayList<Component>()  ;
    protected String description ;
    
    public Composite ( String d )
    {
        description = d ;
    }

    public String printDescription() {
        String printDesc = "\n" + description;
        for (Component obj  : components)
        {
            printDesc += " " + obj.printDescription() + "\n";
        }
        return printDesc;
    }

    public void addChild(Component c) {
        components.add( c ) ;
    }
     
    public void removeChild(Component c) {
        components.remove(c) ;
    }
     
    public Component getChild(int i) {
        return components.get( i ) ;
    }
    
    public double getPrice() {
            /* needs to be implemented by the child class */
            return 0;
        }
    public Placement getPlacement() {
        return null;
    }
}
 
