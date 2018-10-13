  

public interface Component {

     String printDescription() ;
     void addChild(Component c);
     void removeChild(Component c);
     Component getChild(int i);
     double getPrice();
     Placement getPlacement();
}
 
