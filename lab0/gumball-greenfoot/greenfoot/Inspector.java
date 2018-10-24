import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Inspector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inspector extends Alien
{
    
    private ArrayList<Picker> pickers = new ArrayList<Picker>();
    public Inspector()
    {
        //pickers.addAll((ArrayList<Picker>)getObjects(GreenPicker.class));
        
    }
    
    public void addPicker(Picker picker)
    {
        pickers.add(picker);
    }
    
    /**
     * Act - do whatever the Inspector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boolean inspect(ArrayList<Coin> coins) 
    {
        boolean invalidCoinsOnly = false;
        for(Coin c : coins)
        {
            if(c instanceof Quarter && !(c instanceof FakeQuarter))
            {
                invalidCoinsOnly = false;
                break;
            }
            else
            {
                invalidCoinsOnly = true;
            }
        }
        return !invalidCoinsOnly;
    }
    
    public void getGumball(){
        Picker pickerSelected = pickers.get(Greenfoot.getRandomNumber(pickers.size()));
        pickerSelected.pick();
    }
    private void displayText(String message)
    {
        World world = getWorld();
        Label text = new Label(message);
        world.addObject(text,200,200);
    }
}
