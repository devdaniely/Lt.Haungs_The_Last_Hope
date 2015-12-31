import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IntroScreen here.
 * 
 * @author (Ken) 
 * @version (a version number or a date)
 */
public class IntroScreen extends World
{

    /**
     * Constructor for objects of class IntroScreen.
     * 
     */
    public IntroScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(320,320, 1); 
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            Controls c = new Controls();
            Greenfoot.setWorld(c);
        }
    }
}
