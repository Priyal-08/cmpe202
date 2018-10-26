import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.*;
/**
 * Write a description of class Label here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Label extends Actor
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Label
     */
    public Label()
    {
        
    }
    
    /**
     * Constructor for objects of class Label
     */
    public Label(String message)
    {
        GreenfootImage img = new GreenfootImage(message.length() * 10, 50 );
        img.clear();
        img.setColor(Color.BLACK);
        img.drawString(message,10,50);
        setImage(img);
    }
    
    public void act()
    {
        if(Greenfoot.mousePressed(this))
        {
            getWorld().removeObject(this);
        }
    }
}
