import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RandomPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomPicker extends Picker
{
    public RandomPicker()
    {
    }
    
    /**
     * Act - do whatever the RandomPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void pick() 
    {
        Gumball gb = new BlueGumball();
        int randomNumber = Greenfoot.getRandomNumber(3);
        switch (randomNumber)
        {
            case 0:
                gb = new BlueGumball();
            break;
            case 1:
                gb = new GreenGumball();
            break;
            case 2:
                gb = new RedGumball();
            break;
        }
        World world = getWorld();
        world.addObject(gb,500,500);
    }    
}
