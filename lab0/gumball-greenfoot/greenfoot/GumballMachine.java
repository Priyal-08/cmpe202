import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballMachine extends Actor
{
    private boolean hasCoin = false;
    private Inspector inspector = null;
    private ArrayList<Coin> coins = new ArrayList<Coin>();
    private Label text;
    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ;
    }
    
    public void setInspector(Inspector obj)
    {
        inspector = obj;
    }
    
    public void act() 
    {
       if(checkCoin())
       {
           hasCoin = true;
           displayText("Have Coin");
        }
        
       if (Greenfoot.mousePressed(this))
       {
          turnCrank();
       }
    }
    
    public void turnCrank()
    {
        displayText("Crank turned");
        if(hasCoin &&coins.size()>0)
        {
            inspector.getGumball();
            displayText("Take your gumball");
            hasCoin = false;
            coins.clear();
        }
        else
        {
            displayText("Please insert quarter before turning the crank");
        }
    }
    
    private boolean checkCoin()
    {
        Coin intersectingCoin = (Coin)getOneIntersectingObject(Coin.class);
        if(intersectingCoin != null)
        {
            coins.add(intersectingCoin);
            getWorld().removeObject(intersectingCoin);
            if(inspector!=null && inspector.inspect(coins)){
                displayText("Have coin");
                return true;
            }
            displayText("Invalid Coin");
            coins.clear();
        }
        return false;
    }
    
    private void displayText(String message)
    {
        World world = getWorld();
        if(text !=null && text.getWorld()!=null)
        {
            world.removeObject(text);
        }
        text = new Label(message);
        world.addObject(text,250,500);
    }
}
